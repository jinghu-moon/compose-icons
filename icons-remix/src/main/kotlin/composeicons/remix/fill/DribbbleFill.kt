package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DribbbleFill: ImageVector
    get() {
        if (_dribbbleFill != null) return _dribbbleFill!!
        _dribbbleFill = remixIcon(
            name = "DribbbleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C6.479 2 2 6.479 2 12c0 5.521 4.479 10 10 10 5.51 0 10-4.479 10-10C22 6.479 17.51 2 12 2ZM18.605 6.61c1.193 1.453 1.909 3.308 1.931 5.315-.282-.054-3.102-.629-5.944-.271-.065-.141-.119-.293-.184-.445-.174-.412-.369-.835-.564-1.236C16.989 8.692 18.421 6.848 18.605 6.61ZM12 3.475c2.169 0 4.154 .813 5.662 2.148-.152 .217-1.442 1.941-4.479 3.08C11.783 6.132 10.232 4.028 9.993 3.703c.64-.152 1.312-.228 2.007-.228ZM8.367 4.278c.228 .304 1.746 2.419 3.167 4.935C7.542 10.276 4.017 10.254 3.638 10.254 4.191 7.607 5.98 5.406 8.367 4.278ZM3.453 12.011c0-.087 0-.174 0-.26 .369 .011 4.512 .065 8.774-1.215 .25 .477 .477 .965 .694 1.453-.108 .033-.228 .065-.336 .098C8.182 13.508 5.839 17.39 5.644 17.716 4.288 16.208 3.453 14.202 3.453 12.011ZM12 20.547c-1.974 0-3.796-.672-5.239-1.8 .152-.315 1.887-3.655 6.703-5.336 .022-.011 .033-.011 .054-.022 1.204 3.113 1.692 5.727 1.822 6.475-1.03 .445-2.158 .683-3.341 .683ZM16.761 19.082c-.087-.521-.542-3.015-1.66-6.085 2.679-.423 5.022 .271 5.315 .369-.369 2.375-1.735 4.425-3.655 5.716Z"),
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
        return _dribbbleFill!!
    }

private var _dribbbleFill: ImageVector? = null
