package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorBoldIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.14 25.86c-5.118-5.119-12.603-7.074-19.57-5.11l-.22 .07L18.44 79C10.472 81.311 4.758 88.302 4.078 96.571c-.679 8.269 3.817 16.099 11.302 19.679L99 157l40.71 83.65c3.278 6.97 10.298 11.408 18 11.38 .57 0 1.15 0 1.73-.07 8.296-.639 15.309-6.39 17.56-14.4L235.18 45.65c.029-.071 .053-.145 .07-.22 1.964-6.967 .009-14.452-5.11-19.57ZM156.91 221.07 122.54 150.43l46-45.95c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-46 46L34.93 99.09 210 46Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
