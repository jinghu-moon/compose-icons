package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorLightIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M109 148.67c-1.112-1.676-2.989-2.683-5-2.683-2.011 0-3.888 1.008-5 2.683L76.46 182.5 65.05 164.76C63.947 163.04 62.044 162 60 162c-2.044 0-3.947 1.04-5.05 2.76l-36 56c-1.185 1.847-1.267 4.192-.215 6.118C19.787 228.803 21.806 230 24 230h128c2.215 .003 4.251-1.214 5.297-3.166 1.046-1.952 .932-4.322-.297-6.164ZM35 218 60 179.1l11.32 17.6c1.098 1.685 2.967 2.707 4.979 2.724 2.011 .016 3.896-.976 5.021-2.644l22.64-34L140.79 218ZM212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v88c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-88c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
