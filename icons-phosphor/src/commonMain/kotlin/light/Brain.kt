package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorLightIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 124.0f),
                    PathNode.CurveTo(245.9726f, 102.69151f, 233.44637f, 83.381546f, 214.0f, 74.67f),
                    PathNode.LineTo(214.0f, 72.0f),
                    PathNode.CurveTo(213.97931f, 51.127693f, 199.90816f, 32.885357f, 179.7253f, 27.56506f),
                    PathNode.CurveTo(159.54243f, 22.244762f, 138.30711f, 31.18015f, 128.0f, 49.33f),
                    PathNode.CurveTo(117.69289f, 31.18015f, 96.457565f, 22.244762f, 76.274704f, 27.56506f),
                    PathNode.CurveTo(56.091835f, 32.885357f, 42.020687f, 51.127693f, 42.0f, 72.0f),
                    PathNode.LineTo(42.0f, 74.67f),
                    PathNode.CurveTo(22.53636f, 83.35323f, 10.000699f, 102.67229f, 10.000699f, 123.985f),
                    PathNode.CurveTo(10.000699f, 145.29771f, 22.53636f, 164.61678f, 42.0f, 173.3f),
                    PathNode.LineTo(42.0f, 176.0f),
                    PathNode.CurveTo(42.020687f, 196.8723f, 56.091835f, 215.11464f, 76.274704f, 220.43494f),
                    PathNode.CurveTo(96.457565f, 225.75523f, 117.69289f, 216.81985f, 128.0f, 198.67f),
                    PathNode.CurveTo(138.30711f, 216.81985f, 159.54243f, 225.75523f, 179.7253f, 220.43494f),
                    PathNode.CurveTo(199.90816f, 215.11464f, 213.97931f, 196.8723f, 214.0f, 176.0f),
                    PathNode.LineTo(214.0f, 173.3f),
                    PathNode.CurveTo(233.44682f, 164.60501f, 245.97607f, 145.30214f, 246.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 210.0f),
                    PathNode.CurveTo(69.6286f, 210.00893f, 54.572754f, 195.42247f, 54.0f, 177.06f),
                    PathNode.CurveTo(57.29662f, 177.68524f, 60.64461f, 177.99995f, 64.0f, 178.0f),
                    PathNode.LineTo(72.0f, 178.0f),
                    PathNode.CurveTo(75.313705f, 178.0f, 78.0f, 175.3137f, 78.0f, 172.0f),
                    PathNode.CurveTo(78.0f, 168.6863f, 75.313705f, 166.0f, 72.0f, 166.0f),
                    PathNode.LineTo(64.0f, 166.0f),
                    PathNode.CurveTo(43.531216f, 166.01662f, 26.03142f, 151.27538f, 22.570602f, 131.10129f),
                    PathNode.CurveTo(19.109783f, 110.927185f, 30.695972f, 91.19632f, 50.0f, 84.39f),
                    PathNode.CurveTo(52.39837f, 83.54205f, 54.001335f, 81.27385f, 54.0f, 78.73f),
                    PathNode.LineTo(54.0f, 72.0f),
                    PathNode.CurveTo(54.0f, 53.222317f, 69.22232f, 38.0f, 88.0f, 38.0f),
                    PathNode.CurveTo(106.77768f, 38.0f, 122.0f, 53.222317f, 122.0f, 72.0f),
                    PathNode.LineTo(122.0f, 145.05f),
                    PathNode.CurveTo(113.29765f, 135.46101f, 100.94911f, 129.99496f, 88.0f, 130.0f),
                    PathNode.CurveTo(84.686295f, 130.0f, 82.0f, 132.6863f, 82.0f, 136.0f),
                    PathNode.CurveTo(82.0f, 139.3137f, 84.686295f, 142.0f, 88.0f, 142.0f),
                    PathNode.CurveTo(106.77768f, 142.0f, 122.0f, 157.22232f, 122.0f, 176.0f),
                    PathNode.CurveTo(122.0f, 194.77768f, 106.77768f, 210.0f, 88.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 166.0f),
                    PathNode.LineTo(184.0f, 166.0f),
                    PathNode.CurveTo(180.6863f, 166.0f, 178.0f, 168.6863f, 178.0f, 172.0f),
                    PathNode.CurveTo(178.0f, 175.3137f, 180.6863f, 178.0f, 184.0f, 178.0f),
                    PathNode.LineTo(192.0f, 178.0f),
                    PathNode.CurveTo(195.3554f, 177.99995f, 198.70338f, 177.68524f, 202.0f, 177.06f),
                    PathNode.CurveTo(201.41895f, 195.68861f, 185.94902f, 210.37715f, 167.3153f, 209.99277f),
                    PathNode.CurveTo(148.6816f, 209.60838f, 133.83058f, 194.29436f, 134.01825f, 175.65762f),
                    PathNode.CurveTo(134.20593f, 157.0209f, 149.36234f, 142.00905f, 168.0f, 142.0f),
                    PathNode.CurveTo(171.3137f, 142.0f, 174.0f, 139.3137f, 174.0f, 136.0f),
                    PathNode.CurveTo(174.0f, 132.6863f, 171.3137f, 130.0f, 168.0f, 130.0f),
                    PathNode.CurveTo(155.0509f, 129.99496f, 142.70235f, 135.46101f, 134.0f, 145.05f),
                    PathNode.LineTo(134.0f, 72.0f),
                    PathNode.CurveTo(134.0f, 53.222317f, 149.22232f, 38.0f, 168.0f, 38.0f),
                    PathNode.CurveTo(186.77768f, 38.0f, 202.0f, 53.222317f, 202.0f, 72.0f),
                    PathNode.LineTo(202.0f, 78.73f),
                    PathNode.CurveTo(201.99867f, 81.27385f, 203.60164f, 83.54205f, 206.0f, 84.39f),
                    PathNode.CurveTo(225.30403f, 91.19632f, 236.89021f, 110.927185f, 233.4294f, 131.10129f),
                    PathNode.CurveTo(229.96858f, 151.27538f, 212.46878f, 166.01662f, 192.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 112.0f),
                    PathNode.CurveTo(206.0f, 115.313705f, 203.3137f, 118.0f, 200.0f, 118.0f),
                    PathNode.LineTo(196.0f, 118.0f),
                    PathNode.CurveTo(177.22232f, 118.0f, 162.0f, 102.77768f, 162.0f, 84.0f),
                    PathNode.LineTo(162.0f, 80.0f),
                    PathNode.CurveTo(162.0f, 76.686295f, 164.6863f, 74.0f, 168.0f, 74.0f),
                    PathNode.CurveTo(171.3137f, 74.0f, 174.0f, 76.686295f, 174.0f, 80.0f),
                    PathNode.LineTo(174.0f, 84.0f),
                    PathNode.CurveTo(174.0f, 96.15026f, 183.84973f, 106.0f, 196.0f, 106.0f),
                    PathNode.LineTo(200.0f, 106.0f),
                    PathNode.CurveTo(203.3137f, 106.0f, 206.0f, 108.686295f, 206.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 118.0f),
                    PathNode.LineTo(56.0f, 118.0f),
                    PathNode.CurveTo(52.68629f, 118.0f, 50.0f, 115.313705f, 50.0f, 112.0f),
                    PathNode.CurveTo(50.0f, 108.686295f, 52.68629f, 106.0f, 56.0f, 106.0f),
                    PathNode.LineTo(60.0f, 106.0f),
                    PathNode.CurveTo(72.15026f, 106.0f, 82.0f, 96.15026f, 82.0f, 84.0f),
                    PathNode.LineTo(82.0f, 80.0f),
                    PathNode.CurveTo(82.0f, 76.686295f, 84.686295f, 74.0f, 88.0f, 74.0f),
                    PathNode.CurveTo(91.313705f, 74.0f, 94.0f, 76.686295f, 94.0f, 80.0f),
                    PathNode.LineTo(94.0f, 84.0f),
                    PathNode.CurveTo(94.0f, 102.77768f, 78.77768f, 118.0f, 60.0f, 118.0f),
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
        return _brain!!
    }

private var _brain: ImageVector? = null
