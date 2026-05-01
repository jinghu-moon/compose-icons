package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorLightIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(193.83f, 128.0f),
                    PathNode.CurveTo(201.56969f, 117.47555f, 208.23627f, 106.20267f, 213.73f, 94.35f),
                    PathNode.CurveTo(224.47f, 70.47f, 224.73f, 51.69f, 214.53f, 41.47f),
                    PathNode.CurveTo(204.33f, 31.25f, 185.53f, 31.53f, 161.65f, 42.27f),
                    PathNode.CurveTo(149.79733f, 47.76373f, 138.52444f, 54.43031f, 128.0f, 62.17f),
                    PathNode.CurveTo(117.47555f, 54.43031f, 106.20267f, 47.76373f, 94.35f, 42.27f),
                    PathNode.CurveTo(70.47f, 31.53f, 51.69f, 31.27f, 41.47f, 41.47f),
                    PathNode.CurveTo(31.25f, 51.67f, 31.53f, 70.47f, 42.27f, 94.35f),
                    PathNode.CurveTo(47.76373f, 106.20267f, 54.43031f, 117.47555f, 62.17f, 128.0f),
                    PathNode.CurveTo(54.43031f, 138.52444f, 47.76373f, 149.79733f, 42.27f, 161.65f),
                    PathNode.CurveTo(31.53f, 185.53f, 31.27f, 204.31f, 41.47f, 214.53f),
                    PathNode.LineTo(41.47f, 214.53f),
                    PathNode.CurveTo(46.47f, 219.53f, 53.47f, 222.0f, 62.1f, 222.0f),
                    PathNode.CurveTo(71.2f, 222.0f, 82.1f, 219.24f, 94.35f, 213.73f),
                    PathNode.CurveTo(106.20267f, 208.23627f, 117.47555f, 201.56969f, 128.0f, 193.83f),
                    PathNode.CurveTo(138.52444f, 201.56969f, 149.79733f, 208.23627f, 161.65f, 213.73f),
                    PathNode.CurveTo(173.9f, 219.24f, 184.8f, 222.0f, 193.9f, 222.0f),
                    PathNode.CurveTo(202.54f, 222.0f, 209.55f, 219.51f, 214.53f, 214.53f),
                    PathNode.LineTo(214.53f, 214.53f),
                    PathNode.CurveTo(224.76f, 204.31f, 224.47f, 185.53f, 213.73f, 161.65f),
                    PathNode.CurveTo(208.23627f, 149.79733f, 201.56969f, 138.52444f, 193.83f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 50.0f),
                    PathNode.CurveTo(215.28f, 59.28f, 208.36f, 86.29f, 186.2f, 118.0f),
                    PathNode.CurveTo(179.0861f, 109.099434f, 171.48094f, 100.60288f, 163.42f, 92.55f),
                    PathNode.CurveTo(155.37709f, 84.4865f, 146.89056f, 76.87801f, 138.0f, 69.76f),
                    PathNode.CurveTo(169.75f, 47.61f, 196.77f, 40.68f, 206.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.81f, 128.0f),
                    PathNode.CurveTo(171.44179f, 137.48576f, 163.48972f, 146.50323f, 155.0f, 155.0f),
                    PathNode.CurveTo(146.50536f, 163.51373f, 137.48784f, 171.48921f, 128.0f, 178.88f),
                    PathNode.CurveTo(118.51217f, 171.48921f, 109.49465f, 163.51373f, 101.0f, 155.0f),
                    PathNode.CurveTo(92.489f, 146.50278f, 84.513664f, 137.48544f, 77.12f, 128.0f),
                    PathNode.CurveTo(91.95694f, 109.04803f, 109.0422f, 91.96949f, 128.0f, 77.14f),
                    PathNode.CurveTo(137.48465f, 84.52746f, 146.50197f, 92.496086f, 155.0f, 101.0f),
                    PathNode.CurveTo(163.50343f, 109.49556f, 171.46889f, 118.513054f, 178.85f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.0f, 50.0f),
                    PathNode.CurveTo(52.68f, 47.31f, 56.84f, 46.0f, 62.17f, 46.0f),
                    PathNode.CurveTo(75.28f, 46.0f, 95.47f, 54.0f, 118.04f, 69.81f),
                    PathNode.CurveTo(109.11925f, 76.90102f, 100.60571f, 84.489746f, 92.54f, 92.54f),
                    PathNode.CurveTo(84.478775f, 100.59612f, 76.87361f, 109.096016f, 69.76f, 118.0f),
                    PathNode.CurveTo(47.6f, 86.25f, 40.68f, 59.24f, 50.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.0f, 206.0f),
                    PathNode.LineTo(50.0f, 206.0f),
                    PathNode.CurveTo(40.72f, 196.72f, 47.65f, 169.71f, 69.8f, 138.0f),
                    PathNode.CurveTo(76.9139f, 146.90056f, 84.519066f, 155.39711f, 92.58f, 163.45f),
                    PathNode.CurveTo(100.62291f, 171.5135f, 109.10943f, 179.122f, 118.0f, 186.24f),
                    PathNode.CurveTo(86.25f, 208.4f, 59.24f, 215.32f, 50.0f, 206.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 206.0f),
                    PathNode.CurveTo(196.72f, 215.28f, 169.71f, 208.35f, 138.0f, 186.19f),
                    PathNode.CurveTo(146.90292f, 179.08243f, 155.39963f, 171.48047f, 163.45f, 163.42f),
                    PathNode.CurveTo(171.5135f, 155.37709f, 179.122f, 146.89056f, 186.24f, 138.0f),
                    PathNode.CurveTo(208.4f, 169.75f, 215.32f, 196.76f, 206.0f, 206.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
