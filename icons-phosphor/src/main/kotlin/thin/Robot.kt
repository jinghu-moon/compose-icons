package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorThinIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 52.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(56.0f, 52.0f),
                    PathNode.CurveTo(40.53603f, 52.0f, 28.0f, 64.536026f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 207.46397f, 40.53603f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(215.46397f, 220.0f, 228.0f, 207.46397f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 64.536026f, 215.46397f, 52.0f, 200.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 203.0457f, 211.0457f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(44.954304f, 212.0f, 36.0f, 203.0457f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 68.95431f, 44.954304f, 60.0f, 56.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(211.0457f, 60.0f, 220.0f, 68.95431f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 108.0f),
                    PathNode.CurveTo(76.0f, 103.58172f, 79.58172f, 100.0f, 84.0f, 100.0f),
                    PathNode.CurveTo(88.41828f, 100.0f, 92.0f, 103.58172f, 92.0f, 108.0f),
                    PathNode.CurveTo(92.0f, 112.41828f, 88.41828f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(79.58172f, 116.0f, 76.0f, 112.41828f, 76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 108.0f),
                    PathNode.CurveTo(164.0f, 103.58172f, 167.58173f, 100.0f, 172.0f, 100.0f),
                    PathNode.CurveTo(176.41827f, 100.0f, 180.0f, 103.58172f, 180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 112.41828f, 176.41827f, 116.0f, 172.0f, 116.0f),
                    PathNode.CurveTo(167.58173f, 116.0f, 164.0f, 112.41828f, 164.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.CurveTo(78.74516f, 140.0f, 68.0f, 150.74516f, 68.0f, 164.0f),
                    PathNode.CurveTo(68.0f, 177.25484f, 78.74516f, 188.0f, 92.0f, 188.0f),
                    PathNode.LineTo(164.0f, 188.0f),
                    PathNode.CurveTo(177.25484f, 188.0f, 188.0f, 177.25484f, 188.0f, 164.0f),
                    PathNode.CurveTo(188.0f, 150.74516f, 177.25484f, 140.0f, 164.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 148.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.LineTo(112.0f, 180.0f),
                    PathNode.LineTo(112.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 164.0f),
                    PathNode.CurveTo(76.0f, 155.16344f, 83.163445f, 148.0f, 92.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.CurveTo(83.163445f, 180.0f, 76.0f, 172.83656f, 76.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 180.0f),
                    PathNode.LineTo(152.0f, 180.0f),
                    PathNode.LineTo(152.0f, 148.0f),
                    PathNode.LineTo(164.0f, 148.0f),
                    PathNode.CurveTo(172.83656f, 148.0f, 180.0f, 155.16344f, 180.0f, 164.0f),
                    PathNode.CurveTo(180.0f, 172.83656f, 172.83656f, 180.0f, 164.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _robot!!
    }

private var _robot: ImageVector? = null
