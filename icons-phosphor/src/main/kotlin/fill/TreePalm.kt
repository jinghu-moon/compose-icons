package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorFillIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.84f, 60.33f),
                    PathNode.CurveTo(239.322f, 62.89103f, 237.586f, 65.03771f, 235.19f, 66.08f),
                    PathNode.LineTo(179.0f, 90.55f),
                    PathNode.CurveTo(197.28246f, 95.4381f, 212.87743f, 107.382515f, 222.36f, 123.76f),
                    PathNode.CurveTo(231.97092f, 140.16039f, 234.56644f, 159.74211f, 229.56f, 178.08f),
                    PathNode.CurveTo(228.86443f, 180.64844f, 226.9373f, 182.70291f, 224.41856f, 183.56122f),
                    PathNode.CurveTo(221.89983f, 184.41951f, 219.11919f, 183.96927f, 217.0f, 182.36f),
                    PathNode.LineTo(136.0f, 120.68f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 120.68f),
                    PathNode.LineTo(39.0f, 182.36f),
                    PathNode.CurveTo(36.88052f, 183.97385f, 34.096764f, 184.4268f, 31.57498f, 183.56815f),
                    PathNode.CurveTo(29.053192f, 182.70949f, 27.12426f, 180.6519f, 26.43f, 178.08f),
                    PathNode.CurveTo(21.423569f, 159.74211f, 24.019085f, 140.16039f, 33.63f, 123.76f),
                    PathNode.CurveTo(43.114902f, 107.380424f, 58.71385f, 95.43574f, 77.0f, 90.55f),
                    PathNode.LineTo(20.81f, 66.08f),
                    PathNode.CurveTo(18.415915f, 65.03719f, 16.681461f, 62.891567f, 16.163593f, 60.332092f),
                    PathNode.CurveTo(15.645722f, 57.77262f, 16.409624f, 55.12149f, 18.21f, 53.23f),
                    PathNode.CurveTo(30.854544f, 39.68725f, 48.551895f, 31.998749f, 67.08f, 31.998749f),
                    PathNode.CurveTo(85.6081f, 31.998749f, 103.30546f, 39.68725f, 115.95f, 53.23f),
                    PathNode.CurveTo(120.74978f, 58.287586f, 124.79174f, 64.013695f, 127.95f, 70.23f),
                    PathNode.CurveTo(131.12363f, 64.010544f, 135.18254f, 58.284275f, 140.0f, 53.23f),
                    PathNode.CurveTo(152.64455f, 39.68725f, 170.34189f, 31.998749f, 188.87f, 31.998749f),
                    PathNode.CurveTo(207.3981f, 31.998749f, 225.09546f, 39.68725f, 237.74f, 53.23f),
                    PathNode.CurveTo(239.55896f, 55.110844f, 240.3432f, 57.76232f, 239.84f, 60.33f),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
