package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorDuotoneIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(74.98067f, 32.0f, 32.0f, 74.98067f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 181.01933f, 74.98067f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(181.01933f, 224.0f, 224.0f, 181.01933f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 74.98067f, 181.01933f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.CurveTo(71.163445f, 144.0f, 64.0f, 136.83656f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 119.163445f, 71.163445f, 112.0f, 80.0f, 112.0f),
                    PathNode.CurveTo(88.836555f, 112.0f, 96.0f, 119.163445f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 136.83656f, 88.836555f, 144.0f, 80.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 184.83656f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 184.83656f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 144.0f),
                    PathNode.CurveTo(167.16344f, 144.0f, 160.0f, 136.83656f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 119.163445f, 167.16344f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(184.83656f, 112.0f, 192.0f, 119.163445f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 136.83656f, 184.83656f, 144.0f, 176.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.LineTo(183.36f, 216.0f),
                    PathNode.CurveTo(227.17738f, 188.39369f, 243.99031f, 132.74449f, 222.78879f, 85.494446f),
                    PathNode.CurveTo(201.58728f, 38.244404f, 148.83916f, 13.807874f, 99.0867f, 28.187195f),
                    PathNode.CurveTo(49.33425f, 42.566517f, 17.755228f, 91.37505f, 25.029251f, 142.65039f),
                    PathNode.CurveTo(32.303272f, 193.92574f, 76.21129f, 232.02551f, 128.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.41827f, 232.0f, 240.0f, 228.41827f, 240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 219.58173f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 176.60106f, 176.60106f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(79.42178f, 215.94489f, 40.055107f, 176.57822f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 93.25484f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 66.74516f, 141.25484f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(114.74516f, 56.0f, 104.0f, 66.74516f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 93.25484f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 84.41828f, 132.41827f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(123.58172f, 88.0f, 120.0f, 84.41828f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 162.74516f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 162.74516f, 104.0f, 176.0f),
                    PathNode.CurveTo(104.0f, 189.25484f, 114.74516f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(141.25484f, 200.0f, 152.0f, 189.25484f, 152.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 171.58173f, 123.58172f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(132.41827f, 168.0f, 136.0f, 171.58173f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.CurveTo(189.25484f, 152.0f, 200.0f, 141.25484f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 114.74516f, 189.25484f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(162.74516f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 162.74516f, 152.0f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(171.58173f, 136.0f, 168.0f, 132.41827f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 123.58172f, 171.58173f, 120.0f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 104.0f),
                    PathNode.CurveTo(66.74516f, 104.0f, 56.0f, 114.74516f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 141.25484f, 66.74516f, 152.0f, 80.0f, 152.0f),
                    PathNode.CurveTo(93.25484f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 93.25484f, 104.0f, 80.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(75.58172f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 123.58172f, 75.58172f, 120.0f, 80.0f, 120.0f),
                    PathNode.CurveTo(84.41828f, 120.0f, 88.0f, 123.58172f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 132.41827f, 84.41828f, 136.0f, 80.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
