package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clubs: ImageVector
    get() {
        if (_clubs != null) return _clubs!!
        _clubs = tablerOutlineIcon(
            name = "Clubs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.525698f, 3.000078f, 14.91848f, 3.868063f, 15.590662f, 5.237707f),
                    PathNode.CurveTo(16.262844f, 6.607352f, 16.097345f, 8.240095f, 15.164f, 9.447f),
                    PathNode.CurveTo(17.01391f, 8.490668f, 19.288094f, 9.113696f, 20.392303f, 10.879329f),
                    PathNode.CurveTo(21.496513f, 12.64496f, 21.061287f, 14.962429f, 19.391727f, 16.20714f),
                    PathNode.CurveTo(17.722168f, 17.45185f, 15.376898f, 17.207335f, 14.0f, 15.645f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 15.645f),
                    PathNode.CurveTo(8.62288f, 17.206865f, 6.277848f, 17.450974f, 4.608571f, 16.206224f),
                    PathNode.CurveTo(2.939294f, 14.961475f, 2.504187f, 12.644268f, 3.608223f, 10.878768f),
                    PathNode.CurveTo(4.712258f, 9.113268f, 6.98611f, 8.490078f, 8.836f, 9.446f),
                    PathNode.CurveTo(7.903371f, 8.239233f, 7.738145f, 6.607132f, 8.409999f, 5.237935f),
                    PathNode.CurveTo(9.081852f, 3.868739f, 10.473849f, 3.000754f, 11.999f, 3.0f)
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
        return _clubs!!
    }

private var _clubs: ImageVector? = null
