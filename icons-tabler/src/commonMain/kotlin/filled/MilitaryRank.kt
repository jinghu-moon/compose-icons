package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MilitaryRank: ImageVector
    get() {
        if (_militaryRank != null) return _militaryRank!!
        _militaryRank = tablerFilledIcon(
            name = "MilitaryRank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.555f, 2.168f),
                    PathNode.LineTo(18.555f, 6.168f),
                    PathNode.CurveTo(18.833069f, 6.353525f, 19.00005f, 6.665722f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.656855f, 17.656855f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.343146f, 22.0f, 5.0f, 20.656855f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(4.99995f, 6.665722f, 5.16693f, 6.353525f, 5.445f, 6.168f),
                    PathNode.LineTo(11.445f, 2.168f),
                    PathNode.CurveTo(11.781037f, 1.943801f, 12.218963f, 1.943801f, 12.555f, 2.168f),
                    PathNode.MoveTo(12.447f, 15.106f),
                    PathNode.CurveTo(12.165589f, 14.965379f, 11.834411f, 14.965379f, 11.553f, 15.106f),
                    PathNode.LineTo(9.553f, 16.106f),
                    PathNode.CurveTo(9.059473f, 16.353058f, 8.859413f, 16.953238f, 9.106f, 17.447f),
                    PathNode.LineTo(9.164f, 17.549f),
                    PathNode.CurveTo(9.442433f, 17.972528f, 9.993702f, 18.120766f, 10.447f, 17.894f),
                    PathNode.LineTo(12.0f, 17.118f),
                    PathNode.LineTo(13.553f, 17.894f),
                    PathNode.CurveTo(14.043452f, 18.12056f, 14.625178f, 17.91661f, 14.866787f, 17.433393f),
                    PathNode.CurveTo(15.108395f, 16.950176f, 14.92252f, 16.362427f, 14.447f, 16.106f),
                    PathNode.Close,
                    PathNode.MoveTo(12.447f, 11.106f),
                    PathNode.CurveTo(12.165589f, 10.965379f, 11.834411f, 10.965379f, 11.553f, 11.106f),
                    PathNode.LineTo(9.553f, 12.106f),
                    PathNode.CurveTo(9.059473f, 12.353058f, 8.859413f, 12.953238f, 9.106f, 13.447f),
                    PathNode.LineTo(9.164f, 13.549f),
                    PathNode.CurveTo(9.442433f, 13.972529f, 9.993702f, 14.120766f, 10.447f, 13.894f),
                    PathNode.LineTo(12.0f, 13.118f),
                    PathNode.LineTo(13.553f, 13.894f),
                    PathNode.CurveTo(14.043452f, 14.12056f, 14.625178f, 13.91661f, 14.866787f, 13.433393f),
                    PathNode.CurveTo(15.108395f, 12.950176f, 14.92252f, 12.362426f, 14.447f, 12.106f),
                    PathNode.Close,
                    PathNode.MoveTo(12.447f, 7.106f),
                    PathNode.CurveTo(12.165589f, 6.965379f, 11.834411f, 6.965379f, 11.553f, 7.106f),
                    PathNode.LineTo(9.553f, 8.106f),
                    PathNode.CurveTo(9.059473f, 8.353058f, 8.859413f, 8.953238f, 9.106f, 9.447f),
                    PathNode.LineTo(9.164f, 9.549f),
                    PathNode.CurveTo(9.442433f, 9.972529f, 9.993702f, 10.120766f, 10.447f, 9.894f),
                    PathNode.LineTo(12.0f, 9.118f),
                    PathNode.LineTo(13.553f, 9.894f),
                    PathNode.CurveTo(14.043452f, 10.12056f, 14.625178f, 9.91661f, 14.866787f, 9.433393f),
                    PathNode.CurveTo(15.108395f, 8.950176f, 14.92252f, 8.362426f, 14.447f, 8.106f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _militaryRank!!
    }

private var _militaryRank: ImageVector? = null
