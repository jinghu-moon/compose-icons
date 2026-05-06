package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clubs: ImageVector
    get() {
        if (_clubs != null) return _clubs!!
        _clubs = tablerFilledIcon(
            name = "Clubs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C10.093 2 8.352 3.085 7.512 4.797l-.103 .225c-.385 .893-.501 1.879-.334 2.837l.027 .14C4.928 7.954 2.974 9.318 2.268 11.375c-.706 2.057-.001 4.334 1.743 5.633l.198 .14c1.301 .876 2.937 1.091 4.42 .58l.174-.066-.773 3.095c-.075 .299-.008 .615 .182 .858 .189 .243 .48 .385 .788 .385h6l.113-.006c.286-.033 .545-.187 .709-.424 .164-.237 .218-.533 .148-.813l-.774-3.095 .174 .065c1.889 .65 3.983 .113 5.326-1.364 1.344-1.478 1.679-3.613 .853-5.432C20.723 9.113 18.894 7.96 16.897 8l.028-.14C17.18 6.405 16.779 4.913 15.828 3.782 14.878 2.651 13.477 1.999 12 2Z"),
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
        return _clubs!!
    }

private var _clubs: ImageVector? = null
