package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorLightIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 152v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM120 146c-3.314 0-6 2.686-6 6v37.28L84.88 148.51c-1.517-2.121-4.23-3.019-6.713-2.222-2.483 .796-4.167 3.105-4.167 5.712v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-37.28l29.12 40.77c1.126 1.575 2.944 2.51 4.88 2.51 .622 .002 1.24-.096 1.83-.29 2.483-.795 4.168-3.103 4.17-5.71v-56c0-3.314-2.686-6-6-6ZM160 146c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-56c0-3.314-2.686-6-6-6ZM214 88v136c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-130h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM158 82h35.52L158 46.48Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
