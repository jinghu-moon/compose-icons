package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorLightIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.57 117.77c1.231 3.076-.264 6.568-3.34 7.8l-32.73 13.09 19.3 25.74c1.988 2.651 1.451 6.412-1.2 8.4-2.651 1.988-6.412 1.451-8.4-1.2L128 146l-19.2 25.6c-1.988 2.651-5.749 3.188-8.4 1.2-2.651-1.988-3.188-5.749-1.2-8.4l19.3-25.74L85.77 125.57c-3.05-1.249-4.521-4.723-3.297-7.783 1.225-3.059 4.688-4.558 7.757-3.357L122 127.14v-31.14c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v31.14l31.77-12.71c3.076-1.231 6.568 .264 7.8 3.34ZM222 56v56c0 51.94-25.12 83.4-46.2 100.64-22.73 18.6-45.27 24.89-46.22 25.15-1.034 .282-2.126 .282-3.16 0-1-.26-23.49-6.55-46.22-25.15C59.12 195.4 34 163.94 34 112v-56C34 48.268 40.268 42 48 42h160c7.732 0 14 6.268 14 14ZM210 56c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v56c0 37.75 13.94 68.39 41.44 91.06 12.061 9.911 25.797 17.585 40.56 22.66 14.761-5.08 28.496-12.753 40.56-22.66C196.06 180.39 210 149.75 210 112Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
