package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorFillIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.13f, 128.0f),
                    PathNode.CurveTo(233.34276f, 117.103165f, 235.3642f, 98.7471f, 225.81534f, 85.4538f),
                    PathNode.CurveTo(216.26648f, 72.1605f, 198.22574f, 68.215515f, 184.0f, 76.31f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(183.98505f, 42.697956f, 175.74246f, 30.792349f, 163.29688f, 26.096367f),
                    PathNode.CurveTo(150.8513f, 21.400381f, 136.79848f, 24.893452f, 128.0f, 34.87f),
                    PathNode.CurveTo(117.103165f, 22.657244f, 98.7471f, 20.635809f, 85.4538f, 30.184662f),
                    PathNode.CurveTo(72.1605f, 39.733513f, 68.215515f, 57.77426f, 76.31f, 72.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(42.697956f, 72.01496f, 30.792349f, 80.257545f, 26.096367f, 92.70312f),
                    PathNode.CurveTo(21.400381f, 105.1487f, 24.893452f, 119.20153f, 34.87f, 128.0f),
                    PathNode.CurveTo(22.657244f, 138.89684f, 20.635809f, 157.2529f, 30.184662f, 170.5462f),
                    PathNode.CurveTo(39.733513f, 183.8395f, 57.77426f, 187.78448f, 72.0f, 179.69f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.01496f, 213.30205f, 80.257545f, 225.20766f, 92.70312f, 229.90364f),
                    PathNode.CurveTo(105.1487f, 234.59961f, 119.20153f, 231.10657f, 128.0f, 221.13f),
                    PathNode.CurveTo(138.89684f, 233.34276f, 157.2529f, 235.3642f, 170.5462f, 225.81534f),
                    PathNode.CurveTo(183.8395f, 216.26648f, 187.78448f, 198.22574f, 179.69f, 184.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(213.30205f, 183.98505f, 225.20766f, 175.74246f, 229.90364f, 163.29688f),
                    PathNode.CurveTo(234.59961f, 150.8513f, 231.10657f, 136.79848f, 221.13f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 47.163445f, 95.163445f, 40.0f, 104.0f, 40.0f),
                    PathNode.CurveTo(112.836555f, 40.0f, 120.0f, 47.163445f, 120.0f, 56.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(95.163445f, 72.0f, 88.0f, 64.836555f, 88.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 95.163445f, 47.163445f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(112.836555f, 88.0f, 120.0f, 95.163445f, 120.0f, 104.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(47.163445f, 120.0f, 40.0f, 112.836555f, 40.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 208.83656f, 160.83656f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(143.16344f, 216.0f, 136.0f, 208.83656f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.CurveTo(160.83656f, 184.0f, 168.0f, 191.16344f, 168.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(143.16344f, 168.0f, 136.0f, 160.83656f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(208.83656f, 136.0f, 216.0f, 143.16344f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 160.83656f, 208.83656f, 168.0f, 200.0f, 168.0f),
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
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
