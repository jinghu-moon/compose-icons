package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorRegularIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v136c0 8.837 7.163 16 16 16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h112v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c8.837 0 16-7.163 16-16v-136c0-8.837-7.163-16-16-16ZM216 192h-176v-136h176v64h-16.68C195.161 95.396 172.843 78.081 147.977 80.168 123.111 82.255 103.991 103.046 103.991 128c0 24.954 19.12 45.745 43.986 47.832 24.866 2.087 47.184-15.227 51.343-39.832h16.68v56ZM165.84 120c-3.621-6.271-11.003-9.329-17.998-7.455-6.995 1.874-11.859 8.213-11.859 15.455 0 7.242 4.864 13.581 11.859 15.455 6.995 1.874 14.377-1.183 17.998-7.455h17.16c-4.029 15.602-19.03 25.775-35.016 23.745C131.998 157.714 120.016 144.114 120.016 128c0-16.114 11.982-29.715 27.968-31.745C163.97 94.225 178.971 104.398 183 120Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
