package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorFillIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.0f, 144.4f),
                    PathNode.CurveTo(215.11197f, 121.29483f, 200.8583f, 101.19717f, 181.0f, 88.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(244.41827f, 88.0f, 248.0f, 84.41828f, 248.0f, 80.0f),
                    PathNode.CurveTo(248.0f, 75.58172f, 244.41827f, 72.0f, 240.0f, 72.0f),
                    PathNode.LineTo(159.0f, 72.0f),
                    PathNode.CurveTo(155.37465f, 57.840683f, 142.61607f, 47.937252f, 128.0f, 47.937252f),
                    PathNode.CurveTo(113.38393f, 47.937252f, 100.62536f, 57.840683f, 97.0f, 72.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(11.581722f, 72.0f, 8.0f, 75.58172f, 8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 84.41828f, 11.581722f, 88.0f, 16.0f, 88.0f),
                    PathNode.LineTo(75.0f, 88.0f),
                    PathNode.CurveTo(55.14169f, 101.19717f, 40.888027f, 121.29483f, 35.0f, 144.4f),
                    PathNode.CurveTo(19.208746f, 146.90572f, 7.69035f, 160.68262f, 8.021825f, 176.66801f),
                    PathNode.CurveTo(8.353301f, 192.6534f, 20.43291f, 205.94096f, 36.314465f, 207.78992f),
                    PathNode.CurveTo(52.19602f, 209.63885f, 67.00509f, 199.4817f, 71.0f, 184.0f),
                    PathNode.LineTo(185.0f, 184.0f),
                    PathNode.CurveTo(188.9949f, 199.4817f, 203.80399f, 209.63885f, 219.68553f, 207.78992f),
                    PathNode.CurveTo(235.5671f, 205.94096f, 247.6467f, 192.6534f, 247.97818f, 176.66801f),
                    PathNode.CurveTo(248.30965f, 160.68262f, 236.79126f, 146.90572f, 221.0f, 144.4f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 192.0f),
                    PathNode.CurveTo(31.163445f, 192.0f, 24.0f, 184.83656f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 167.16344f, 31.163445f, 160.0f, 40.0f, 160.0f),
                    PathNode.CurveTo(48.836555f, 160.0f, 56.0f, 167.16344f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 184.83656f, 48.836555f, 192.0f, 40.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(207.16344f, 192.0f, 200.0f, 184.83656f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 167.16344f, 207.16344f, 160.0f, 216.0f, 160.0f),
                    PathNode.CurveTo(224.83656f, 160.0f, 232.0f, 167.16344f, 232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 184.83656f, 224.83656f, 192.0f, 216.0f, 192.0f),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
