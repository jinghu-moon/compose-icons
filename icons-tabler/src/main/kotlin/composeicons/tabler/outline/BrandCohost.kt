package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCohost: ImageVector
    get() {
        if (_brandCohost != null) return _brandCohost!!
        _brandCohost = tablerOutlineIcon(
            name = "BrandCohost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 15.104569f, 15.343145f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(18.656855f, 16.0f, 20.0f, 15.104569f, 20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 12.895431f, 18.656855f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(15.343145f, 12.0f, 14.0f, 12.895431f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(4.526f, 17.666f),
                    PathNode.CurveTo(3.393f, 16.894f, 2.629f, 15.742f, 2.235f, 14.21f),
                    PathNode.CurveTo(1.837f, 12.67f, 1.945f, 11.273f, 2.555f, 10.02f),
                    PathNode.CurveTo(3.165f, 8.765f, 4.145f, 7.68f, 5.493f, 6.766f),
                    PathNode.CurveTo(6.841f, 5.852f, 8.423f, 5.141f, 10.242f, 4.634f),
                    PathNode.CurveTo(12.052f, 4.13f, 13.758f, 3.926f, 15.362f, 4.024f),
                    PathNode.CurveTo(16.97f, 4.124f, 18.341f, 4.561f, 19.474f, 5.334f),
                    PathNode.CurveTo(20.607f, 6.107f, 21.371f, 7.258f, 21.765f, 8.79f),
                    PathNode.CurveTo(22.163f, 10.331f, 22.055f, 11.728f, 21.445f, 12.982f),
                    PathNode.CurveTo(20.835f, 14.235f, 19.855f, 15.319f, 18.507f, 16.234f),
                    PathNode.CurveTo(17.159f, 17.149f, 15.577f, 17.86f, 13.758f, 18.367f),
                    PathNode.CurveTo(11.948f, 18.87f, 10.242f, 19.074f, 8.638f, 18.977f),
                    PathNode.CurveTo(7.03f, 18.875f, 5.659f, 18.439f, 4.526f, 17.667f)
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
                    PathNode.MoveTo(11.0f, 12.508f),
                    PathNode.CurveTo(10.47f, 12.192f, 9.77f, 12.0f, 9.0f, 12.0f),
                    PathNode.CurveTo(7.343f, 12.0f, 6.0f, 12.895f, 6.0f, 14.0f),
                    PathNode.CurveTo(6.0f, 15.105f, 7.343f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(9.767f, 16.0f, 10.467f, 15.808f, 11.0f, 15.492f)
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
        return _brandCohost!!
    }

private var _brandCohost: ImageVector? = null
