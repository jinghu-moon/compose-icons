package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorLightIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 98.27f),
                    PathNode.LineTo(134.0f, 58.6f),
                    PathNode.LineTo(164.91f, 77.14f),
                    PathNode.CurveTo(166.74933f, 78.32216f, 169.0861f, 78.41018f, 171.00916f, 77.36974f),
                    PathNode.CurveTo(172.9322f, 76.32931f, 174.13704f, 74.32515f, 174.15385f, 72.138756f),
                    PathNode.CurveTo(174.17067f, 69.952354f, 172.99681f, 67.9299f, 171.09f, 66.86f),
                    PathNode.LineTo(139.66f, 48.0f),
                    PathNode.LineTo(171.09f, 29.15f),
                    PathNode.CurveTo(173.9315f, 27.44344f, 174.85156f, 23.756506f, 173.145f, 20.915f),
                    PathNode.CurveTo(171.43845f, 18.073494f, 167.75151f, 17.15344f, 164.91f, 18.86f),
                    PathNode.LineTo(128.0f, 41.0f),
                    PathNode.LineTo(91.09f, 18.86f),
                    PathNode.CurveTo(88.2485f, 17.15344f, 84.56156f, 18.073494f, 82.855f, 20.915f),
                    PathNode.CurveTo(81.14844f, 23.756506f, 82.0685f, 27.44344f, 84.91f, 29.15f),
                    PathNode.LineTo(116.34f, 48.0f),
                    PathNode.LineTo(84.91f, 66.86f),
                    PathNode.CurveTo(83.00319f, 67.9299f, 81.82933f, 69.952354f, 81.846146f, 72.138756f),
                    PathNode.CurveTo(81.86297f, 74.32515f, 83.0678f, 76.32931f, 84.990845f, 77.36974f),
                    PathNode.CurveTo(86.913895f, 78.41018f, 89.25067f, 78.32216f, 91.09f, 77.14f),
                    PathNode.LineTo(122.0f, 58.6f),
                    PathNode.LineTo(122.0f, 98.27f),
                    PathNode.CurveTo(84.64591f, 101.483604f, 56.456154f, 133.55759f, 58.064438f, 171.01515f),
                    PathNode.CurveTo(59.67272f, 208.4727f, 90.507935f, 238.01239f, 128.0f, 238.01239f),
                    PathNode.CurveTo(165.49207f, 238.01239f, 196.32729f, 208.4727f, 197.93556f, 171.01515f),
                    PathNode.CurveTo(199.54385f, 133.55759f, 171.35408f, 101.483604f, 134.0f, 98.27f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(95.96748f, 226.0f, 70.0f, 200.03252f, 70.0f, 168.0f),
                    PathNode.CurveTo(70.0f, 135.96748f, 95.96748f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(160.03252f, 110.0f, 186.0f, 135.96748f, 186.0f, 168.0f),
                    PathNode.CurveTo(185.96143f, 200.01653f, 160.01653f, 225.96143f, 128.0f, 226.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
