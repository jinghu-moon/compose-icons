package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorBoldIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(168.0f, 28.0f),
                    PathNode.CurveTo(161.37259f, 28.0f, 156.0f, 33.37258f, 156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 46.62742f, 161.37259f, 52.0f, 168.0f, 52.0f),
                    PathNode.LineTo(187.0f, 52.0f),
                    PathNode.LineTo(154.28f, 84.74f),
                    PathNode.CurveTo(118.99209f, 58.36773f, 69.32524f, 63.73755f, 40.489456f, 97.04267f),
                    PathNode.CurveTo(11.653673f, 130.3478f, 13.446693f, 180.27188f, 44.597404f, 211.42259f),
                    PathNode.CurveTo(75.748116f, 242.5733f, 125.67221f, 244.36633f, 158.97733f, 215.53055f),
                    PathNode.CurveTo(192.28246f, 186.69476f, 197.65227f, 137.02791f, 171.28f, 101.74f),
                    PathNode.LineTo(204.0f, 69.0f),
                    PathNode.LineTo(204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 94.62742f, 209.37259f, 100.0f, 216.0f, 100.0f),
                    PathNode.CurveTo(222.62741f, 100.0f, 228.0f, 94.62742f, 228.0f, 88.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.41f, 194.46f),
                    PathNode.CurveTo(122.97604f, 217.88448f, 84.990555f, 217.87935f, 61.562916f, 194.44855f),
                    PathNode.CurveTo(38.135277f, 171.01775f, 38.135277f, 133.03226f, 61.562916f, 109.601456f),
                    PathNode.CurveTo(84.990555f, 86.170654f, 122.97604f, 86.16553f, 146.41f, 109.59f),
                    PathNode.CurveTo(169.7978f, 133.04623f, 169.7978f, 171.00377f, 146.41f, 194.46f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
