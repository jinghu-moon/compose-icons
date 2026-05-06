package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VimeoFill: ImageVector
    get() {
        if (_vimeoFill != null) return _vimeoFill!!
        _vimeoFill = remixIcon(
            name = "VimeoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.174 8.301C.893 7.888 .922 7.888 1.502 7.379 2.734 6.297 3.896 5.113 5.238 4.167 6.453 3.315 8.064 2.765 9.165 4.12c1.014 1.249 1.038 3.141 1.295 4.649 .257 1.564 .503 3.164 1.052 4.661 .152 .421 .442 1.216 .968 1.283 .678 .093 1.368-1.096 1.682-1.54 .817-1.179 1.925-2.769 1.785-4.286C15.809 7.276 14.068 7.579 12.981 7.964c.174-1.809 1.858-3.843 3.48-4.531 1.719-.713 4.277-.701 5.14 1.238 .922 2.102 .093 4.543-.912 6.448-1.097 2.068-2.509 3.983-4.018 5.77-1.331 1.588-2.906 3.33-4.891 4.089C9.514 21.842 8.171 20.158 7.399 18.208 6.556 16.085 6.137 13.702 5.529 11.491 5.273 10.557 4.969 9.494 4.362 8.723 3.57 7.728 2.67 8.663 1.888 9.2 1.619 8.933 1.397 8.593 1.174 8.301Z"),
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
        return _vimeoFill!!
    }

private var _vimeoFill: ImageVector? = null
