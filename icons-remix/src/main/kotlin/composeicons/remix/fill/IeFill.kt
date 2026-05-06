package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IeFill: ImageVector
    get() {
        if (_ieFill != null) return _ieFill!!
        _ieFill = remixIcon(
            name = "IeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.613 20.119c-2.744 1.491-5.113 1.799-6.422 .491C.847 19.269 1.563 15.759 3.504 12.237 4.452 10.517 5.692 8.794 7.128 7.32 7.315 7.133 8.253 6.197 8.315 6.197c0 0-.5 .312-.562 .312C5.803 7.604 4.09 9.589 3.716 10.035c.058-.259 .127-.514 .206-.765C5.079 5.634 8.482 3 12.501 3c.23 0 .458 .009 .683 .026 3.094-1.403 5.974-1.726 7.192-.511 1.125 1.123 1.062 2.995 .125 5.242-.009 .022-.018 .043-.027 .064 .656 1.249 1.027 2.671 1.027 4.179 0 .379-.024 .753-.069 1.12h-.805c-.051 .002-.098 .003-.142 .003h-11.795v.187c.062 1.997 1.812 3.744 3.937 3.744 1.5 0 2.938-.811 3.562-1.997h4.779c-.007 .021-.015 .042-.023 .063-1.269 3.433-4.571 5.88-8.444 5.88-1.392 0-2.711-.316-3.888-.881ZM8.006 19.799C6.18 18.744 4.759 17.067 4.034 15.057c-1.161 2.282-1.46 4.19-.468 5.179 .813 .812 2.438 .624 4.438-.436l.004-.002ZM20.173 7.292c.005-.011 .01-.023 .016-.034 .75-1.623 .812-2.995 .125-3.806-.869-.868-2.54-.75-4.523 .168 1.829 .718 3.365 2.018 4.382 3.672ZM16.564 10.753v-.062C16.439 8.631 14.814 7.071 12.814 7.071c-2.125 0-3.937 1.685-4.062 3.62v.062h7.812Z"),
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
        return _ieFill!!
    }

private var _ieFill: ImageVector? = null
