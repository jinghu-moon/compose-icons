package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XMark: ImageVector
    get() {
        if (_xMark != null) return _xMark!!
        _xMark = tablerOutlineIcon(
            name = "XMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(15.644f, 19.644f),
                    PathNode.CurveTo(15.870952f, 19.871164f, 16.178892f, 19.998802f, 16.5f, 19.998802f),
                    PathNode.CurveTo(16.821108f, 19.998802f, 17.12905f, 19.871164f, 17.356f, 19.644f),
                    PathNode.LineTo(19.644f, 17.356f),
                    PathNode.CurveTo(19.871164f, 17.12905f, 19.998802f, 16.821108f, 19.998802f, 16.5f),
                    PathNode.CurveTo(19.998802f, 16.178892f, 19.871164f, 15.870952f, 19.644f, 15.644f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(19.644f, 8.356f),
                    PathNode.CurveTo(19.871164f, 8.129049f, 19.998802f, 7.821109f, 19.998802f, 7.5f),
                    PathNode.CurveTo(19.998802f, 7.178892f, 19.871164f, 6.870952f, 19.644f, 6.644f),
                    PathNode.LineTo(17.356f, 4.356f),
                    PathNode.CurveTo(17.12905f, 4.128836f, 16.821108f, 4.001198f, 16.5f, 4.001198f),
                    PathNode.CurveTo(16.178892f, 4.001198f, 15.870952f, 4.128836f, 15.644f, 4.356f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(8.356f, 4.356f),
                    PathNode.CurveTo(8.129049f, 4.128836f, 7.821109f, 4.001198f, 7.5f, 4.001198f),
                    PathNode.CurveTo(7.178892f, 4.001198f, 6.870952f, 4.128836f, 6.644f, 4.356f),
                    PathNode.LineTo(4.356f, 6.644f),
                    PathNode.CurveTo(4.128836f, 6.870952f, 4.001198f, 7.178892f, 4.001198f, 7.5f),
                    PathNode.CurveTo(4.001198f, 7.821109f, 4.128836f, 8.129049f, 4.356f, 8.356f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(4.356f, 15.644f),
                    PathNode.CurveTo(4.128836f, 15.870952f, 4.001198f, 16.178892f, 4.001198f, 16.5f),
                    PathNode.CurveTo(4.001198f, 16.821108f, 4.128836f, 17.12905f, 4.356f, 17.356f),
                    PathNode.LineTo(6.644f, 19.644f),
                    PathNode.CurveTo(6.870952f, 19.871164f, 7.178892f, 19.998802f, 7.5f, 19.998802f),
                    PathNode.CurveTo(7.821109f, 19.998802f, 8.129049f, 19.871164f, 8.356f, 19.644f),
                    PathNode.LineTo(12.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _xMark!!
    }

private var _xMark: ImageVector? = null
