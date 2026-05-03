package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles2: ImageVector
    get() {
        if (_sparkles2 != null) return _sparkles2!!
        _sparkles2 = tablerOutlineIcon(
            name = "Sparkles2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.520178f, 6.862203f, 14.027414f, 6.679517f, 14.516f, 6.454f),
                    PathNode.CurveTo(15.427f, 6.016f, 16.01f, 5.439f, 16.453f, 4.522f),
                    PathNode.CurveTo(16.66f, 4.094f, 16.835f, 3.594f, 17.0f, 3.0f),
                    PathNode.CurveTo(17.165f, 3.595f, 17.34f, 4.095f, 17.547f, 4.521f),
                    PathNode.CurveTo(17.99f, 5.439f, 18.573f, 6.016f, 19.484f, 6.454f),
                    PathNode.CurveTo(19.91f, 6.659f, 20.409f, 6.834f, 21.0f, 7.0f),
                    PathNode.CurveTo(20.47979f, 7.138121f, 19.972553f, 7.321141f, 19.484f, 7.547f),
                    PathNode.CurveTo(18.573f, 7.985f, 17.99f, 8.562f, 17.547f, 9.479f),
                    PathNode.CurveTo(17.319416f, 9.968568f, 17.136345f, 10.47762f, 17.0f, 11.0f),
                    PathNode.CurveTo(16.835f, 10.406f, 16.66f, 9.905f, 16.453f, 9.479f),
                    PathNode.CurveTo(16.01f, 8.561f, 15.427f, 7.985f, 14.516f, 7.547f),
                    PathNode.CurveTo(14.028042f, 7.319697f, 13.520675f, 7.13663f, 13.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.557763f, 13.845507f, 4.1089f, 13.668022f, 4.652f, 13.468f),
                    PathNode.CurveTo(7.194f, 12.515f, 8.505f, 11.23f, 9.468f, 8.662f),
                    PathNode.CurveTo(9.66943f, 8.116004f, 9.846931f, 7.561476f, 10.0f, 7.0f),
                    PathNode.CurveTo(10.153069f, 7.561476f, 10.33057f, 8.116004f, 10.532f, 8.662f),
                    PathNode.CurveTo(11.495f, 11.229f, 12.807f, 12.515f, 15.348f, 13.468f),
                    PathNode.QuadTo(16.098f, 13.748f, 17.0f, 14.0f),
                    PathNode.CurveTo(16.442238f, 14.154493f, 15.8911f, 14.331978f, 15.348f, 14.532f),
                    PathNode.CurveTo(12.806f, 15.485f, 11.494f, 16.77f, 10.532f, 19.338f),
                    PathNode.CurveTo(10.33057f, 19.883995f, 10.153069f, 20.438524f, 10.0f, 21.0f),
                    PathNode.CurveTo(9.846931f, 20.438524f, 9.66943f, 19.883995f, 9.468f, 19.338f),
                    PathNode.CurveTo(8.505f, 16.77f, 7.193f, 15.485f, 4.652f, 14.532f),
                    PathNode.CurveTo(4.1089f, 14.331978f, 3.557763f, 14.154493f, 3.0f, 14.0f)
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
        return _sparkles2!!
    }

private var _sparkles2: ImageVector? = null
