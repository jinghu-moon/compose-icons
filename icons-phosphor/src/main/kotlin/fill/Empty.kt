package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorFillIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.49f, 91.59f),
                    PathNode.CurveTo(188.52254f, 112.72672f, 188.33109f, 143.8889f, 170.04019f, 164.80246f),
                    PathNode.CurveTo(151.74928f, 185.71602f, 120.890274f, 190.0565f, 97.54f, 175.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(106.14896f, 72.02253f, 86.306755f, 84.75272f, 77.17838f, 104.605705f),
                    PathNode.CurveTo(68.05f, 124.45869f, 71.30291f, 147.808f, 85.51f, 164.41f),
                    PathNode.LineTo(158.51f, 81.04f),
                    PathNode.CurveTo(149.43617f, 75.122345f, 138.83295f, 71.980644f, 128.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.40791f, 24.071625f, 231.92838f, 70.59208f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.01515f, 110.020294f, 193.2728f, 92.691475f, 181.11f, 79.45f),
                    PathNode.LineTo(186.0f, 73.27f),
                    PathNode.CurveTo(188.09082f, 71.15783f, 188.83842f, 68.06068f, 187.94138f, 65.22729f),
                    PathNode.CurveTo(187.04433f, 62.3939f, 184.6505f, 60.291317f, 181.72505f, 59.767292f),
                    PathNode.CurveTo(178.79962f, 59.243263f, 175.8248f, 60.384167f, 174.0f, 62.73f),
                    PathNode.LineTo(169.09f, 68.91f),
                    PathNode.CurveTo(138.99112f, 48.17283f, 98.130196f, 53.278236f, 74.05905f, 80.78374f),
                    PathNode.CurveTo(49.987904f, 108.289246f, 50.345192f, 149.46632f, 74.89f, 176.55f),
                    PathNode.LineTo(70.0f, 182.73f),
                    PathNode.CurveTo(67.40085f, 186.07132f, 67.85457f, 190.85905f, 71.03511f, 193.65262f),
                    PathNode.CurveTo(74.21565f, 196.4462f, 79.02193f, 196.2785f, 82.0f, 193.27f),
                    PathNode.LineTo(86.91f, 187.09f),
                    PathNode.CurveTo(108.90755f, 202.42137f, 137.60536f, 204.24892f, 161.37f, 191.83179f),
                    PathNode.CurveTo(185.13463f, 179.41467f, 200.02312f, 154.8131f, 200.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _empty!!
    }

private var _empty: ImageVector? = null
