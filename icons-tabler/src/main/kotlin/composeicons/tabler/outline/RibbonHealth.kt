package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RibbonHealth: ImageVector
    get() {
        if (_ribbonHealth != null) return _ribbonHealth!!
        _ribbonHealth = tablerOutlineIcon(
            name = "RibbonHealth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 21.0f, 16.286f, 11.159f, 16.286f, 7.159f),
                    PathNode.CurveTo(16.350382f, 6.0318f, 15.918538f, 4.932827f, 15.104f, 4.151f),
                    PathNode.CurveTo(14.27392f, 3.353843f, 13.148867f, 2.939197f, 12.0f, 3.007f),
                    PathNode.CurveTo(10.85128f, 2.938931f, 9.726248f, 3.353207f, 8.896f, 4.15f),
                    PathNode.CurveTo(8.080915f, 4.932291f, 7.649024f, 6.032117f, 7.714f, 7.16f),
                    PathNode.CurveTo(7.714f, 11.16f, 17.0f, 21.0f, 17.0f, 21.0f)
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
        return _ribbonHealth!!
    }

private var _ribbonHealth: ImageVector? = null
