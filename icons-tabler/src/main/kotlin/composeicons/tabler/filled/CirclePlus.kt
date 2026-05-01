package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CirclePlus: ImageVector
    get() {
        if (_circlePlus != null) return _circlePlus!!
        _circlePlus = tablerFilledIcon(
            name = "CirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.929f, 4.929f),
                    PathNode.CurveTo(7.444115f, 2.349315f, 11.152472f, 1.322007f, 14.636473f, 2.239786f),
                    PathNode.CurveTo(18.120474f, 3.157565f, 20.841436f, 5.878527f, 21.759214f, 9.362528f),
                    PathNode.CurveTo(22.676992f, 12.846528f, 21.649685f, 16.554884f, 19.07f, 19.07f),
                    PathNode.CurveTo(15.146211f, 22.859722f, 8.909152f, 22.805523f, 5.051814f, 18.948183f),
                    PathNode.CurveTo(1.194476f, 15.090848f, 1.140278f, 8.853789f, 4.93f, 4.93f),
                    PathNode.MoveTo(13.001f, 9.001f),
                    PathNode.CurveTo(13.001f, 8.448715f, 12.553285f, 8.001001f, 12.001f, 8.001001f),
                    PathNode.CurveTo(11.448715f, 8.001001f, 11.001f, 8.448715f, 11.001f, 9.001f),
                    PathNode.LineTo(11.001f, 11.001f),
                    PathNode.LineTo(9.001f, 11.001f),
                    PathNode.CurveTo(8.448715f, 11.001f, 8.001001f, 11.448715f, 8.001001f, 12.001f),
                    PathNode.CurveTo(8.001001f, 12.553285f, 8.448715f, 13.001f, 9.001f, 13.001f),
                    PathNode.LineTo(11.001f, 13.001f),
                    PathNode.LineTo(11.001f, 15.001f),
                    PathNode.CurveTo(11.001f, 15.553285f, 11.448715f, 16.001f, 12.001f, 16.001f),
                    PathNode.CurveTo(12.553285f, 16.001f, 13.001f, 15.553285f, 13.001f, 15.001f),
                    PathNode.LineTo(13.001f, 13.001f),
                    PathNode.LineTo(15.001f, 13.001f),
                    PathNode.CurveTo(15.553285f, 13.001f, 16.001f, 12.553285f, 16.001f, 12.001f),
                    PathNode.CurveTo(16.001f, 11.448715f, 15.553285f, 11.001f, 15.001f, 11.001f),
                    PathNode.LineTo(13.001f, 11.001f),
                    PathNode.LineTo(13.001f, 9.001f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circlePlus!!
    }

private var _circlePlus: ImageVector? = null
