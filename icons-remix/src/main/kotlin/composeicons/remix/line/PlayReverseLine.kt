package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayReverseLine: ImageVector
    get() {
        if (_playReverseLine != null) return _playReverseLine!!
        _playReverseLine = remixIcon(
            name = "PlayReverseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.606 12 14 7.737v8.526L7.606 12ZM4.624 12.416l10.599 7.066c.23 .153 .54 .091 .693-.139 .055-.082 .084-.179 .084-.277v-14.131c0-.276-.224-.5-.5-.5-.099 0-.195 .029-.277 .084L4.624 11.584c-.23 .153-.292 .464-.139 .693 .037 .055 .084 .102 .139 .139Z"),
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
        return _playReverseLine!!
    }

private var _playReverseLine: ImageVector? = null
