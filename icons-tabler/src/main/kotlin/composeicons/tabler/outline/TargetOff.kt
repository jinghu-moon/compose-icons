package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TargetOff: ImageVector
    get() {
        if (_targetOff != null) return _targetOff!!
        _targetOff = tablerOutlineIcon(
            name = "TargetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.286f, 11.3f),
                    PathNode.CurveTo(10.894154f, 11.689361f, 10.892139f, 12.322654f, 11.2815f, 12.7145f),
                    PathNode.CurveTo(11.67086f, 13.106346f, 12.304154f, 13.10836f, 12.696f, 12.719f)
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
                    PathNode.MoveTo(8.44f, 8.49f),
                    PathNode.CurveTo(6.502f, 10.451252f, 6.517455f, 13.611195f, 8.474545f, 15.553396f),
                    PathNode.CurveTo(10.431637f, 17.495598f, 13.591605f, 17.486921f, 15.538f, 15.534f),
                    PathNode.MoveTo(16.915f, 12.923f),
                    PathNode.CurveTo(17.220308f, 11.298699f, 16.703224f, 9.628468f, 15.533558f, 8.460801f),
                    PathNode.CurveTo(14.363891f, 7.293134f, 12.692776f, 6.778911f, 11.069f, 7.087f)
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
                    PathNode.MoveTo(5.649f, 5.623f),
                    PathNode.CurveTo(2.125976f, 9.129456f, 2.112544f, 14.827975f, 5.619f, 18.351f),
                    PathNode.CurveTo(9.125456f, 21.874025f, 14.823976f, 21.887457f, 18.347f, 18.381f),
                    PathNode.MoveTo(20.03f, 16.068f),
                    PathNode.CurveTo(21.789948f, 12.600019f, 21.123297f, 8.393884f, 18.377228f, 5.640084f),
                    PathNode.CurveTo(15.63116f, 2.886283f, 11.426916f, 2.207809f, 7.954f, 3.958f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _targetOff!!
    }

private var _targetOff: ImageVector? = null
