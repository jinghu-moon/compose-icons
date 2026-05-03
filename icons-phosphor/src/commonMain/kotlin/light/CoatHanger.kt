package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorLightIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.37f, 172.8f),
                    PathNode.LineTo(138.0f, 96.0f),
                    PathNode.LineTo(163.59f, 76.8f),
                    PathNode.CurveTo(165.1046f, 75.66897f, 165.99763f, 73.890305f, 166.0f, 72.0f),
                    PathNode.CurveTo(166.0f, 51.01318f, 148.98682f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(107.013176f, 34.0f, 90.0f, 51.01318f, 90.0f, 72.0f),
                    PathNode.CurveTo(90.0f, 75.313705f, 92.686295f, 78.0f, 96.0f, 78.0f),
                    PathNode.CurveTo(99.313705f, 78.0f, 102.0f, 75.313705f, 102.0f, 72.0f),
                    PathNode.CurveTo(102.0895f, 58.266815f, 112.84436f, 46.971592f, 126.55667f, 46.209503f),
                    PathNode.CurveTo(140.26898f, 45.447414f, 152.20926f, 55.48131f, 153.82f, 69.12f),
                    PathNode.LineTo(124.5f, 91.12f),
                    PathNode.LineTo(124.29f, 91.28f),
                    PathNode.LineTo(15.63f, 172.8f),
                    PathNode.CurveTo(10.813568f, 176.4123f, 8.84592f, 182.69937f, 10.743653f, 188.41298f),
                    PathNode.CurveTo(12.641387f, 194.12659f, 17.97949f, 197.98712f, 24.0f, 198.0f),
                    PathNode.LineTo(232.0f, 198.0f),
                    PathNode.CurveTo(238.02419f, 197.9957f, 243.37018f, 194.13818f, 245.27315f, 188.42245f),
                    PathNode.CurveTo(247.17613f, 182.70673f, 245.20935f, 176.4145f, 240.39f, 172.8f),
                    PathNode.Close,
                    PathNode.MoveTo(233.87f, 184.63f),
                    PathNode.CurveTo(233.64552f, 185.46901f, 232.86765f, 186.0389f, 232.0f, 186.0f),
                    PathNode.LineTo(24.0f, 186.0f),
                    PathNode.CurveTo(23.140976f, 185.99571f, 22.380634f, 185.44336f, 22.111023f, 184.62773f),
                    PathNode.CurveTo(21.841413f, 183.8121f, 22.12276f, 182.9154f, 22.81f, 182.4f),
                    PathNode.LineTo(128.0f, 103.5f),
                    PathNode.LineTo(233.17f, 182.4f),
                    PathNode.CurveTo(233.9028f, 182.88315f, 234.19524f, 183.81471f, 233.87f, 184.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
