package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorFillIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 112.0f),
                    PathNode.LineTo(211.31f, 112.0f),
                    PathNode.LineTo(168.0f, 68.69f),
                    PathNode.CurveTo(165.00975f, 65.67581f, 160.93579f, 63.986435f, 156.69f, 64.0f),
                    PathNode.LineTo(44.28f, 64.0f),
                    PathNode.CurveTo(38.942883f, 64.00988f, 33.962097f, 66.680305f, 31.0f, 71.12f),
                    PathNode.LineTo(1.34f, 115.56f),
                    PathNode.CurveTo(0.468519f, 116.87701f, 0.002609f, 118.42077f, 0f, 120.0f),
                    PathNode.LineTo(0f, 168.0f),
                    PathNode.CurveTo(0f, 176.83656f, 7.163444f, 184.0f, 16.0f, 184.0f),
                    PathNode.LineTo(33.0f, 184.0f),
                    PathNode.CurveTo(36.62536f, 198.15932f, 49.38393f, 208.06276f, 64.0f, 208.06276f),
                    PathNode.CurveTo(78.61607f, 208.06276f, 91.37464f, 198.15932f, 95.0f, 184.0f),
                    PathNode.LineTo(161.0f, 184.0f),
                    PathNode.CurveTo(164.62535f, 198.15932f, 177.38393f, 208.06276f, 192.0f, 208.06276f),
                    PathNode.CurveTo(206.61607f, 208.06276f, 219.37465f, 198.15932f, 223.0f, 184.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.CurveTo(248.83656f, 184.0f, 256.0f, 176.83656f, 256.0f, 168.0f),
                    PathNode.LineTo(256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 119.163445f, 248.83656f, 112.0f, 240.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.28f, 80.0f),
                    PathNode.LineTo(156.69f, 80.0f),
                    PathNode.LineTo(188.69f, 112.0f),
                    PathNode.LineTo(23.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 192.0f),
                    PathNode.CurveTo(55.163445f, 192.0f, 48.0f, 184.83656f, 48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 167.16344f, 55.163445f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(72.836555f, 160.0f, 80.0f, 167.16344f, 80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 184.83656f, 72.836555f, 192.0f, 64.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.CurveTo(183.16344f, 192.0f, 176.0f, 184.83656f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 167.16344f, 183.16344f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(200.83656f, 160.0f, 208.0f, 167.16344f, 208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 184.83656f, 200.83656f, 192.0f, 192.0f, 192.0f),
                    PathNode.Close
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
