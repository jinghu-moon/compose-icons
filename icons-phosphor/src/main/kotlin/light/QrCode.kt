package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = phosphorLightIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(48.268013f, 42.0f, 42.0f, 48.268013f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 111.73199f, 48.268013f, 118.0f, 56.0f, 118.0f),
                    PathNode.LineTo(104.0f, 118.0f),
                    PathNode.CurveTo(111.73199f, 118.0f, 118.0f, 111.73199f, 118.0f, 104.0f),
                    PathNode.LineTo(118.0f, 56.0f),
                    PathNode.CurveTo(118.0f, 48.268013f, 111.73199f, 42.0f, 104.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 104.0f),
                    PathNode.CurveTo(106.0f, 105.10457f, 105.10457f, 106.0f, 104.0f, 106.0f),
                    PathNode.LineTo(56.0f, 106.0f),
                    PathNode.CurveTo(54.89543f, 106.0f, 54.0f, 105.10457f, 54.0f, 104.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 54.89543f, 54.89543f, 54.0f, 56.0f, 54.0f),
                    PathNode.LineTo(104.0f, 54.0f),
                    PathNode.CurveTo(105.10457f, 54.0f, 106.0f, 54.89543f, 106.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 138.0f),
                    PathNode.LineTo(56.0f, 138.0f),
                    PathNode.CurveTo(48.268013f, 138.0f, 42.0f, 144.26802f, 42.0f, 152.0f),
                    PathNode.LineTo(42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 207.73198f, 48.268013f, 214.0f, 56.0f, 214.0f),
                    PathNode.LineTo(104.0f, 214.0f),
                    PathNode.CurveTo(111.73199f, 214.0f, 118.0f, 207.73198f, 118.0f, 200.0f),
                    PathNode.LineTo(118.0f, 152.0f),
                    PathNode.CurveTo(118.0f, 144.26802f, 111.73199f, 138.0f, 104.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 200.0f),
                    PathNode.CurveTo(106.0f, 201.10457f, 105.10457f, 202.0f, 104.0f, 202.0f),
                    PathNode.LineTo(56.0f, 202.0f),
                    PathNode.CurveTo(54.89543f, 202.0f, 54.0f, 201.10457f, 54.0f, 200.0f),
                    PathNode.LineTo(54.0f, 152.0f),
                    PathNode.CurveTo(54.0f, 150.89543f, 54.89543f, 150.0f, 56.0f, 150.0f),
                    PathNode.LineTo(104.0f, 150.0f),
                    PathNode.CurveTo(105.10457f, 150.0f, 106.0f, 150.89543f, 106.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.LineTo(152.0f, 42.0f),
                    PathNode.CurveTo(144.26802f, 42.0f, 138.0f, 48.268013f, 138.0f, 56.0f),
                    PathNode.LineTo(138.0f, 104.0f),
                    PathNode.CurveTo(138.0f, 111.73199f, 144.26802f, 118.0f, 152.0f, 118.0f),
                    PathNode.LineTo(200.0f, 118.0f),
                    PathNode.CurveTo(207.73198f, 118.0f, 214.0f, 111.73199f, 214.0f, 104.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 105.10457f, 201.10457f, 106.0f, 200.0f, 106.0f),
                    PathNode.LineTo(152.0f, 106.0f),
                    PathNode.CurveTo(150.89543f, 106.0f, 150.0f, 105.10457f, 150.0f, 104.0f),
                    PathNode.LineTo(150.0f, 56.0f),
                    PathNode.CurveTo(150.0f, 54.89543f, 150.89543f, 54.0f, 152.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 176.0f),
                    PathNode.LineTo(138.0f, 144.0f),
                    PathNode.CurveTo(138.0f, 140.6863f, 140.6863f, 138.0f, 144.0f, 138.0f),
                    PathNode.CurveTo(147.3137f, 138.0f, 150.0f, 140.6863f, 150.0f, 144.0f),
                    PathNode.LineTo(150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 179.3137f, 147.3137f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(140.6863f, 182.0f, 138.0f, 179.3137f, 138.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 160.0f),
                    PathNode.CurveTo(214.0f, 163.3137f, 211.3137f, 166.0f, 208.0f, 166.0f),
                    PathNode.LineTo(182.0f, 166.0f),
                    PathNode.LineTo(182.0f, 208.0f),
                    PathNode.CurveTo(182.0f, 211.3137f, 179.3137f, 214.0f, 176.0f, 214.0f),
                    PathNode.LineTo(144.0f, 214.0f),
                    PathNode.CurveTo(140.6863f, 214.0f, 138.0f, 211.3137f, 138.0f, 208.0f),
                    PathNode.CurveTo(138.0f, 204.6863f, 140.6863f, 202.0f, 144.0f, 202.0f),
                    PathNode.LineTo(170.0f, 202.0f),
                    PathNode.LineTo(170.0f, 144.0f),
                    PathNode.CurveTo(170.0f, 140.6863f, 172.6863f, 138.0f, 176.0f, 138.0f),
                    PathNode.CurveTo(179.3137f, 138.0f, 182.0f, 140.6863f, 182.0f, 144.0f),
                    PathNode.LineTo(182.0f, 154.0f),
                    PathNode.LineTo(208.0f, 154.0f),
                    PathNode.CurveTo(211.3137f, 154.0f, 214.0f, 156.6863f, 214.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 192.0f),
                    PathNode.LineTo(214.0f, 208.0f),
                    PathNode.CurveTo(214.0f, 211.3137f, 211.3137f, 214.0f, 208.0f, 214.0f),
                    PathNode.CurveTo(204.6863f, 214.0f, 202.0f, 211.3137f, 202.0f, 208.0f),
                    PathNode.LineTo(202.0f, 192.0f),
                    PathNode.CurveTo(202.0f, 188.6863f, 204.6863f, 186.0f, 208.0f, 186.0f),
                    PathNode.CurveTo(211.3137f, 186.0f, 214.0f, 188.6863f, 214.0f, 192.0f),
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
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
