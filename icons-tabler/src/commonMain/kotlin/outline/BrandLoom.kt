package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLoom: ImageVector
    get() {
        if (_brandLoom != null) return _brandLoom!!
        _brandLoom = tablerOutlineIcon(
            name = "BrandLoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.464f, 6.518f),
                    PathNode.CurveTo(16.095211f, 3.507111f, 12.548038f, 2.171715f, 9.533487f, 3.532417f),
                    PathNode.CurveTo(6.518935f, 4.893119f, 5.174022f, 8.436694f, 6.526628f, 11.454887f),
                    PathNode.CurveTo(7.879234f, 14.473081f, 11.419187f, 15.8275f, 14.441f, 14.483f)
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
                    PathNode.MoveTo(17.482f, 17.464f),
                    PathNode.CurveTo(20.49289f, 16.095211f, 21.828285f, 12.548038f, 20.467583f, 9.533487f),
                    PathNode.CurveTo(19.106882f, 6.518935f, 15.563306f, 5.174022f, 12.545113f, 6.526628f),
                    PathNode.CurveTo(9.526919f, 7.879234f, 8.1725f, 11.419187f, 9.517f, 14.441f)
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
                    PathNode.MoveTo(6.54f, 17.482f),
                    PathNode.CurveTo(7.908558f, 20.492922f, 11.455535f, 21.828579f, 14.470158f, 20.46819f),
                    PathNode.CurveTo(17.48478f, 19.107803f, 18.83005f, 15.564461f, 17.477844f, 12.54616f),
                    PathNode.CurveTo(16.125639f, 9.527859f, 12.585958f, 8.172985f, 9.564f, 9.517f)
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
                    PathNode.MoveTo(6.518f, 6.54f),
                    PathNode.CurveTo(3.507078f, 7.908558f, 2.171424f, 11.455535f, 3.53181f, 14.470158f),
                    PathNode.CurveTo(4.892197f, 17.48478f, 8.435539f, 18.83005f, 11.45384f, 17.477844f),
                    PathNode.CurveTo(14.472141f, 16.125639f, 15.827015f, 12.585958f, 14.483f, 9.564f)
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
        return _brandLoom!!
    }

private var _brandLoom: ImageVector? = null
