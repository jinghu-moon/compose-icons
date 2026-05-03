package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = tablerFilledIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 5.000 C 12.552 5.000 13.000 5.448 13.000 6.000 C 13.000 6.552 12.552 7.000 12.000 7.000 L 6.000 7.000 C 5.448 7.000 5.000 7.448 5.000 8.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 16.000 19.000 C 16.552 19.000 17.000 18.552 17.000 18.000 L 17.000 12.000 C 17.000 11.448 17.448 11.000 18.000 11.000 C 18.552 11.000 19.000 11.448 19.000 12.000 L 19.000 18.000 C 19.000 19.657 17.657 21.000 16.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 8.000 C 3.000 6.343 4.343 5.000 6.000 5.000 ZM 15.000 3.000 L 20.000 3.000 L 20.075 3.003 L 20.201 3.020 L 20.312 3.050 L 20.423 3.094 L 20.521 3.146 L 20.617 3.213 L 20.707 3.293 Q 20.761 3.346 20.804 3.405 L 20.875 3.515 L 20.929 3.629 L 20.964 3.734 L 20.994 3.882 L 21.000 4.000 L 21.000 9.000 C 21.000 9.552 20.552 10.000 20.000 10.000 C 19.448 10.000 19.000 9.552 19.000 9.000 L 19.000 6.414 L 11.707 13.707 C 11.315 14.086 10.691 14.081 10.305 13.695 C 9.919 13.309 9.914 12.685 10.293 12.293 L 17.584 5.000 L 15.000 5.000 C 14.448 5.000 14.000 4.552 14.000 4.000 C 14.000 3.448 14.448 3.000 15.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
