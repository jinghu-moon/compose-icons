package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) return _brandSketch!!
        _brandSketch = tablerOutlineIcon(
            name = "BrandSketch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.262f, 10.878f),
                    PathNode.LineTo(11.262f, 19.667f),
                    PathNode.CurveTo(11.662f, 20.107f, 12.353f, 20.107f, 12.753f, 19.667f),
                    PathNode.LineTo(20.753f, 10.877f),
                    PathNode.CurveTo(21.066f, 10.533f, 21.102f, 10.018f, 20.84f, 9.634f),
                    PathNode.LineTo(17.303f, 4.44f),
                    PathNode.CurveTo(17.11722f, 4.167989f, 16.809399f, 4.004915f, 16.48f, 4.004f),
                    PathNode.LineTo(7.554f, 4.004f),
                    PathNode.CurveTo(7.224601f, 4.004915f, 6.916781f, 4.167989f, 6.731f, 4.44f),
                    PathNode.LineTo(3.191f, 9.632f),
                    PathNode.CurveTo(2.928f, 10.017f, 2.964f, 10.533f, 3.278f, 10.878f),
                    PathNode.LineTo(3.262f, 10.878f)
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
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
