package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) return _brandSketch!!
        _brandSketch = tablerFilledIcon(
            name = "BrandSketch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.554f, 3.004f),
                    PathNode.LineTo(16.483f, 3.004f),
                    PathNode.CurveTo(17.142338f, 3.005726f, 17.758463f, 3.332307f, 18.13f, 3.877f),
                    PathNode.LineTo(21.666f, 9.07f),
                    PathNode.CurveTo(22.189262f, 9.837073f, 22.117697f, 10.863006f, 21.493f, 11.55f),
                    PathNode.LineTo(13.493f, 20.34f),
                    PathNode.CurveTo(13.112631f, 20.758368f, 12.573431f, 20.99688f, 12.008f, 20.99688f),
                    PathNode.CurveTo(11.442569f, 20.99688f, 10.903369f, 20.758368f, 10.523f, 20.34f),
                    PathNode.LineTo(2.523f, 11.551f),
                    PathNode.CurveTo(2.473419f, 11.497579f, 2.429827f, 11.438896f, 2.393f, 11.376f),
                    PathNode.LineTo(2.381f, 11.35f),
                    PathNode.LineTo(2.33f, 11.278f),
                    PathNode.CurveTo(1.932782f, 10.653137f, 1.911265f, 9.860491f, 2.274f, 9.215f),
                    PathNode.LineTo(2.364f, 9.069f),
                    PathNode.LineTo(5.905f, 3.876f),
                    PathNode.CurveTo(6.277f, 3.332f, 6.892f, 3.006f, 7.554f, 3.004f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
