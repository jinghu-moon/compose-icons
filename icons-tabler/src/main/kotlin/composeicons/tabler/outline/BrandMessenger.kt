package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMessenger: ImageVector
    get() {
        if (_brandMessenger != null) return _brandMessenger!!
        _brandMessenger = tablerOutlineIcon(
            name = "BrandMessenger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(4.3f, 16.1f),
                    PathNode.CurveTo(1.976117f, 12.66301f, 2.873876f, 8.227707f, 6.399768f, 5.726275f),
                    PathNode.CurveTo(9.925659f, 3.224842f, 14.990228f, 3.430189f, 18.245287f, 6.206561f),
                    PathNode.CurveTo(21.500341f, 8.982932f, 21.940113f, 13.472466f, 19.27387f, 16.707129f),
                    PathNode.CurveTo(16.607628f, 19.94179f, 11.659201f, 20.92211f, 7.7f, 19.0f),
                    PathNode.LineTo(3.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(16.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandMessenger!!
    }

private var _brandMessenger: ImageVector? = null
