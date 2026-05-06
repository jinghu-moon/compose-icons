package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorBoldIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 156h120c11.046 0 20-8.954 20-20v-60C236 64.954 227.046 56 216 56h-24v-16C192 28.954 183.046 20 172 20h-32c-11.046 0-20 8.954-20 20v16h-24C84.954 56 76 64.954 76 76v60c0 11.046 8.954 20 20 20ZM144 44h24v12h-24ZM100 80h112v52h-112ZM92 224c0 11.046-8.954 20-20 20C60.954 244 52 235.046 52 224c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM236 224c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM252 180c0 6.627-5.373 12-12 12h-208c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-91L15.51 56.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L54.14 61.17c3.764 3.741 5.874 8.833 5.86 14.14v92.69h180c6.627 0 12 5.373 12 12Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
