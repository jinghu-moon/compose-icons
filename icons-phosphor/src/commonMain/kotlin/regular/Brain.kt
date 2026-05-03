package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorRegularIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 124.0f),
                    PathNode.CurveTo(247.97844f, 102.372696f, 235.52895f, 82.68307f, 216.0f, 73.39f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(215.98105f, 50.835358f, 202.10219f, 32.180897f, 181.83583f, 26.080267f),
                    PathNode.CurveTo(161.56949f, 19.979635f, 139.69919f, 27.872784f, 128.0f, 45.51f),
                    PathNode.CurveTo(116.30081f, 27.872784f, 94.430504f, 19.979635f, 74.16416f, 26.080267f),
                    PathNode.CurveTo(53.897816f, 32.180897f, 40.018948f, 50.835358f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 73.39f),
                    PathNode.CurveTo(20.45288f, 82.65846f, 7.992499f, 102.35683f, 7.992499f, 123.99f),
                    PathNode.CurveTo(7.992499f, 145.62317f, 20.45288f, 165.32153f, 40.0f, 174.59f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(40.018948f, 197.16464f, 53.897816f, 215.8191f, 74.16416f, 221.91974f),
                    PathNode.CurveTo(94.430504f, 228.02037f, 116.30081f, 220.12721f, 128.0f, 202.49f),
                    PathNode.CurveTo(139.69919f, 220.12721f, 161.56949f, 228.02037f, 181.83583f, 221.91974f),
                    PathNode.CurveTo(202.10219f, 215.8191f, 215.98105f, 197.16464f, 216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 174.59f),
                    PathNode.CurveTo(235.52579f, 165.30383f, 247.97559f, 145.62149f, 248.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 208.0f),
                    PathNode.CurveTo(71.66011f, 207.99767f, 57.946537f, 195.68521f, 56.19f, 179.44f),
                    PathNode.CurveTo(58.777035f, 179.80908f, 61.386772f, 179.9962f, 64.0f, 180.0f),
                    PathNode.LineTo(72.0f, 180.0f),
                    PathNode.CurveTo(76.41828f, 180.0f, 80.0f, 176.41827f, 80.0f, 172.0f),
                    PathNode.CurveTo(80.0f, 167.58173f, 76.41828f, 164.0f, 72.0f, 164.0f),
                    PathNode.LineTo(64.0f, 164.0f),
                    PathNode.CurveTo(44.4997f, 164.02278f, 27.824797f, 149.98071f, 24.528782f, 130.76097f),
                    PathNode.CurveTo(21.232767f, 111.54123f, 32.276318f, 92.7457f, 50.67f, 86.27f),
                    PathNode.CurveTo(53.8642f, 85.13909f, 55.99945f, 82.1185f, 56.0f, 78.73f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 54.32689f, 70.32689f, 40.0f, 88.0f, 40.0f),
                    PathNode.CurveTo(105.67311f, 40.0f, 120.0f, 54.32689f, 120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 140.26f),
                    PathNode.CurveTo(111.21516f, 132.35887f, 99.81529f, 127.9913f, 88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 131.58173f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 140.41827f, 83.58172f, 144.0f, 88.0f, 144.0f),
                    PathNode.CurveTo(105.67311f, 144.0f, 120.0f, 158.32689f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 193.67311f, 105.67311f, 208.0f, 88.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 164.0f),
                    PathNode.LineTo(184.0f, 164.0f),
                    PathNode.CurveTo(179.58173f, 164.0f, 176.0f, 167.58173f, 176.0f, 172.0f),
                    PathNode.CurveTo(176.0f, 176.41827f, 179.58173f, 180.0f, 184.0f, 180.0f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.CurveTo(194.61322f, 179.9962f, 197.22296f, 179.80908f, 199.81f, 179.44f),
                    PathNode.CurveTo(197.95813f, 196.56685f, 182.88036f, 209.15416f, 165.69814f, 207.91743f),
                    PathNode.CurveTo(148.51588f, 206.68071f, 135.39618f, 192.06384f, 136.01617f, 174.84831f),
                    PathNode.CurveTo(136.63615f, 157.6328f, 150.77332f, 143.99754f, 168.0f, 144.0f),
                    PathNode.CurveTo(172.41827f, 144.0f, 176.0f, 140.41827f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 131.58173f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.CurveTo(156.18471f, 127.9913f, 144.78485f, 132.35887f, 136.0f, 140.26f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 54.32689f, 150.32689f, 40.0f, 168.0f, 40.0f),
                    PathNode.CurveTo(185.67311f, 40.0f, 200.0f, 54.32689f, 200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 78.73f),
                    PathNode.CurveTo(200.00055f, 82.1185f, 202.1358f, 85.13909f, 205.33f, 86.27f),
                    PathNode.CurveTo(223.72368f, 92.7457f, 234.76723f, 111.54123f, 231.47122f, 130.76097f),
                    PathNode.CurveTo(228.1752f, 149.98071f, 211.5003f, 164.02278f, 192.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 116.41828f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.CurveTo(176.11777f, 120.0f, 160.0f, 103.88225f, 160.0f, 84.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 75.58172f, 163.58173f, 72.0f, 168.0f, 72.0f),
                    PathNode.CurveTo(172.41827f, 72.0f, 176.0f, 75.58172f, 176.0f, 80.0f),
                    PathNode.LineTo(176.0f, 84.0f),
                    PathNode.CurveTo(176.0f, 95.04569f, 184.9543f, 104.0f, 196.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(204.41827f, 104.0f, 208.0f, 107.58172f, 208.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(51.581722f, 120.0f, 48.0f, 116.41828f, 48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 107.58172f, 51.581722f, 104.0f, 56.0f, 104.0f),
                    PathNode.LineTo(60.0f, 104.0f),
                    PathNode.CurveTo(71.04569f, 104.0f, 80.0f, 95.04569f, 80.0f, 84.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 75.58172f, 83.58172f, 72.0f, 88.0f, 72.0f),
                    PathNode.CurveTo(92.41828f, 72.0f, 96.0f, 75.58172f, 96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(96.0f, 103.88225f, 79.88225f, 120.0f, 60.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brain!!
    }

private var _brain: ImageVector? = null
