package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BallBowling: ImageVector
    get() {
        if (_ballBowling != null) return _ballBowling!!
        _ballBowling = tablerFilledIcon(
            name = "BallBowling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c3.12 1.774 5.05 5.083 5.057 8.671 .008 3.588-1.908 6.906-5.019 8.693C13.926 22.492 10.096 22.475 7 20.66 2.258 17.88 .649 11.794 3.397 7.033 6.146 2.273 12.221 .623 17 3.34M14 11c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M11 8c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C12 8.448 11.552 8 11 8M15 7c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C16 7.448 15.552 7 15 7"),
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
        return _ballBowling!!
    }

private var _ballBowling: ImageVector? = null
