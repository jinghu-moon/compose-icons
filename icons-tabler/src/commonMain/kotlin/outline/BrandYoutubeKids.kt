package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYoutubeKids: ImageVector
    get() {
        if (_brandYoutubeKids != null) return _brandYoutubeKids!!
        _brandYoutubeKids = tablerOutlineIcon(
            name = "BrandYoutubeKids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.608f, 17.75f),
                    PathNode.LineTo(14.708f, 18.018f),
                    PathNode.LineTo(14.681f, 18.018f),
                    PathNode.CurveTo(13.408054f, 18.120827f, 12.155486f, 18.399475f, 10.959f, 18.846f),
                    PathNode.LineTo(8.448f, 19.754f),
                    PathNode.CurveTo(7.370122f, 20.143309f, 6.178664f, 20.065014f, 5.161f, 19.538f),
                    PathNode.CurveTo(4.161906f, 19.027334f, 3.437846f, 18.103245f, 3.181f, 17.011f),
                    PathNode.LineTo(1.805f, 10.961f),
                    PathNode.CurveTo(1.581839f, 9.974539f, 1.775779f, 8.939709f, 2.341f, 8.101f),
                    PathNode.CurveTo(2.921805f, 7.243422f, 3.815195f, 6.647231f, 4.83f, 6.44f),
                    PathNode.LineTo(16.08f, 4.086f),
                    PathNode.CurveTo(18.217f, 3.638f, 20.327f, 4.936f, 20.793f, 6.986f),
                    PathNode.LineTo(22.196f, 13.148f),
                    PathNode.CurveTo(22.440704f, 14.229141f, 22.184618f, 15.36298f, 21.499f, 16.234f),
                    PathNode.CurveTo(20.793653f, 17.125004f, 19.743155f, 17.674608f, 18.609f, 17.746f),
                    PathNode.LineTo(18.609f, 17.748f),
                    PathNode.LineTo(18.608f, 17.75f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(10.208f, 15.0f),
                    PathNode.LineTo(14.5f, 11.0f),
                    PathNode.LineTo(9.0f, 10.0f)
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
        return _brandYoutubeKids!!
    }

private var _brandYoutubeKids: ImageVector? = null
