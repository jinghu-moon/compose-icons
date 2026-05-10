package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeOffFill: ImageVector
    get() {
        if (_eyeOffFill != null) return _eyeOffFill!!
        _eyeOffFill = remixIcon(
            name = "EyeOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.52 5.935 1.394 2.808 2.808 1.394 22.607 21.192l-1.414 1.414L17.883 19.297c-1.701 1.079-3.719 1.703-5.882 1.703-5.392 0-9.878-3.88-10.819-9C1.618 9.623 2.819 7.513 4.52 5.935ZM14.758 16.172 13.294 14.708c-.392 .187-.83 .292-1.293 .292-1.657 0-3-1.343-3-3 0-.463 .105-.902 .292-1.293L7.829 9.243c-.524 .79-.828 1.738-.828 2.757 0 2.761 2.239 5 5 5 1.019 0 1.967-.305 2.757-.828ZM7.974 3.76c1.247-.491 2.605-.76 4.026-.76 5.392 0 9.878 3.88 10.819 9-.312 1.7-1.015 3.263-2.012 4.592L16.947 12.733c.035-.239 .053-.484 .053-.733 0-2.761-2.239-5-5-5-.249 0-.494 .018-.733 .053L7.974 3.76Z"),
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
        return _eyeOffFill!!
    }

private var _eyeOffFill: ImageVector? = null
