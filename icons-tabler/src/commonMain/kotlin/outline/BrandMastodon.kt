package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMastodon: ImageVector
    get() {
        if (_brandMastodon != null) return _brandMastodon!!
        _brandMastodon = tablerOutlineIcon(
            name = "BrandMastodon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.648f, 15.254f),
                    PathNode.CurveTo(16.832f, 17.017f, 12.0f, 16.88f, 12.0f, 16.88f),
                    PathNode.CurveTo(10.898522f, 16.894007f, 9.798036f, 16.808325f, 8.712f, 16.624f),
                    PathNode.CurveTo(9.839f, 18.609f, 12.832f, 19.434f, 17.694f, 19.099f),
                    PathNode.CurveTo(15.749f, 21.112f, 4.096f, 24.356f, 4.026f, 11.463f),
                    PathNode.LineTo(4.0f, 10.309f),
                    PathNode.CurveTo(4.0f, 7.273f, 4.023f, 6.194f, 5.352f, 4.676f),
                    PathNode.CurveTo(7.023f, 2.766f, 12.0f, 3.01f, 12.0f, 3.01f),
                    PathNode.CurveTo(12.0f, 3.01f, 16.977f, 2.767f, 18.648f, 4.677f),
                    PathNode.CurveTo(19.977f, 6.195f, 20.0f, 7.274f, 20.0f, 10.31f),
                    PathNode.CurveTo(20.0f, 13.346f, 19.544f, 14.384f, 18.648f, 15.254f)
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
                    PathNode.MoveTo(12.0f, 11.204f),
                    PathNode.LineTo(12.0f, 8.278f),
                    PathNode.CurveTo(12.0f, 7.02f, 11.105f, 6.0f, 10.0f, 6.0f),
                    PathNode.CurveTo(8.895f, 6.0f, 8.0f, 7.02f, 8.0f, 8.278f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.MoveTo(12.0f, 8.278f),
                    PathNode.CurveTo(12.0f, 7.02f, 12.895f, 6.0f, 14.0f, 6.0f),
                    PathNode.CurveTo(15.105f, 6.0f, 16.0f, 7.02f, 16.0f, 8.278f),
                    PathNode.LineTo(16.0f, 13.0f)
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
        return _brandMastodon!!
    }

private var _brandMastodon: ImageVector? = null
