package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = tablerOutlineIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.105f, 18.79f),
                    PathNode.LineTo(10.105f, 19.782f),
                    PathNode.CurveTo(8.51031f, 21.362589f, 5.948948f, 21.392092f, 4.318276f, 19.84865f),
                    PathNode.CurveTo(2.687603f, 18.30521f, 2.576382f, 15.746094f, 4.067f, 14.067f),
                    PathNode.LineTo(4.224f, 13.901f),
                    PathNode.LineTo(12.506f, 5.5f),
                    PathNode.LineTo(14.006f, 7.0f),
                    PathNode.LineTo(17.456f, 3.609f),
                    PathNode.CurveTo(18.245703f, 2.826398f, 19.51123f, 2.80319f, 20.329096f, 3.556312f),
                    PathNode.CurveTo(21.146963f, 4.309434f, 21.227968f, 5.572578f, 20.513f, 6.424f),
                    PathNode.LineTo(20.397f, 6.55f),
                    PathNode.LineTo(17.006f, 10.0f),
                    PathNode.LineTo(18.506f, 11.5f),
                    PathNode.LineTo(14.838f, 15.117f)
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
                    PathNode.MoveTo(10.5f, 7.5f),
                    PathNode.LineTo(16.5f, 13.5f)
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
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.656855f, 12.343145f, 21.0f, 14.0f, 21.0f),
                    PathNode.CurveTo(15.656855f, 21.0f, 17.0f, 19.656855f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.0f, 16.343145f, 15.656855f, 15.0f, 14.0f, 15.0f),
                    PathNode.CurveTo(12.343145f, 15.0f, 11.0f, 16.343145f, 11.0f, 18.0f)
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
