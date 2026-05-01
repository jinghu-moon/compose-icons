package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorRegularIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 81.90861f, 150.09138f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(105.90861f, 64.0f, 88.0f, 81.90861f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 126.09139f, 105.90861f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(150.09138f, 144.0f, 168.0f, 126.09139f, 168.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 90.74516f, 114.74516f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(141.25484f, 80.0f, 152.0f, 90.74516f, 152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 117.25484f, 141.25484f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(114.74516f, 128.0f, 104.0f, 117.25484f, 104.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 183.6f),
                    PathNode.CurveTo(178.4124f, 179.33739f, 210.03366f, 142.56859f, 207.89969f, 99.99598f),
                    PathNode.CurveTo(205.7657f, 57.423374f, 170.62605f, 24.001005f, 128.0f, 24.001005f),
                    PathNode.CurveTo(85.37394f, 24.001005f, 50.234295f, 57.423374f, 48.100315f, 99.99598f),
                    PathNode.CurveTo(45.966335f, 142.56859f, 77.58761f, 179.33739f, 120.0f, 183.6f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 68.65378f, 92.65378f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(163.34622f, 40.0f, 192.0f, 68.65378f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 139.34622f, 163.34622f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(92.66977f, 167.96143f, 64.03858f, 139.33023f, 64.0f, 104.0f),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
