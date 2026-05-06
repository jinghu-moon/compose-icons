package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerOutlineIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.792 17.063c0 .337 .057 .618 .057 .9 0 1.8-1.238 3.037-2.982 3.037C10.067 21 8.887 19.762 8.887 17.794v-.731c-.957 .675-1.576 .9-2.42 .9-1.518 0-2.925-1.463-2.925-3.094 0-1.181 .844-2.194 2.082-2.756L5.904 12C4.33 11.213 3.542 10.312 3.542 9.075 3.542 7.388 4.836 5.981 6.467 5.981c.675 0 1.52 .338 2.138 .788l.281 .112c0-.337-.056-.619-.056-.844C8.83 4.237 10.067 3 11.81 3c1.8 0 2.981 1.237 2.981 3.206v.394l-.056 .281c.956-.675 1.575-.9 2.419-.9 1.519 0 2.925 1.463 2.925 3.094 0 1.181-.844 2.194-2.081 2.756L17.716 12c1.575 .787 2.363 1.688 2.363 2.925 0 1.688-1.294 3.094-2.925 3.094-.675 0-1.575-.281-2.138-.788l-.225-.169 .001 .001"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
