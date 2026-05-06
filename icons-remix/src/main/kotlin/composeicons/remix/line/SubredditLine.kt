package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SubredditLine: ImageVector
    get() {
        if (_subredditLine != null) return _subredditLine!!
        _subredditLine = remixIcon(
            name = "SubredditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.592 9.873c-.3 0-.595 .073-.888 .221-.297 .151-.547 .38-.724 .662-.192 .294-.287 .646-.287 1.053v4.401h-2.139v-8.299h2.084v1.193h.039c.279-.382 .63-.698 1.053-.946 .443-.253 .946-.382 1.457-.372 .191 0 .372 .016 .542 .047 .17 .031 .297 .064 .38 .101l-.86 2.053c-.085-.042-.177-.069-.271-.081-.128-.024-.258-.036-.388-.036l.001 .001ZM22 12c0 2.652-1.054 5.196-2.929 7.071C17.196 20.946 14.652 22 12 22 9.348 22 6.804 20.946 4.929 19.071 3.054 17.196 2 14.652 2 12 2 9.348 3.054 6.804 4.929 4.929 6.804 3.054 9.348 2 12 2c2.652 0 5.196 1.054 7.071 2.929C20.946 6.804 22 9.348 22 12ZM20 12c.001-1.865-.652-3.671-1.846-5.104l-3.954 9.316h-2.172L16.592 5.459C15.249 4.509 13.645 3.999 12 4 7.589 4 4 7.589 4 12c0 4.411 3.589 8 8 8 4.411 0 8-3.589 8-8Z"),
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
        return _subredditLine!!
    }

private var _subredditLine: ImageVector? = null
