package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorThinIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 108.0f),
                    PathNode.LineTo(225.66f, 108.0f),
                    PathNode.LineTo(189.17f, 71.51f),
                    PathNode.CurveTo(186.92447f, 69.256035f, 183.87163f, 67.99242f, 180.69f, 68.0f),
                    PathNode.LineTo(136.0f, 68.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.LineTo(164.0f, 36.0f),
                    PathNode.CurveTo(166.20914f, 36.0f, 168.0f, 34.20914f, 168.0f, 32.0f),
                    PathNode.CurveTo(168.0f, 29.790861f, 166.20914f, 28.0f, 164.0f, 28.0f),
                    PathNode.LineTo(100.0f, 28.0f),
                    PathNode.CurveTo(97.79086f, 28.0f, 96.0f, 29.790861f, 96.0f, 32.0f),
                    PathNode.CurveTo(96.0f, 34.20914f, 97.79086f, 36.0f, 100.0f, 36.0f),
                    PathNode.LineTo(128.0f, 36.0f),
                    PathNode.LineTo(128.0f, 68.0f),
                    PathNode.LineTo(64.0f, 68.0f),
                    PathNode.CurveTo(57.37258f, 68.0f, 52.0f, 73.37258f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.LineTo(20.0f, 136.0f),
                    PathNode.LineTo(20.0f, 108.0f),
                    PathNode.CurveTo(20.0f, 105.79086f, 18.209139f, 104.0f, 16.0f, 104.0f),
                    PathNode.CurveTo(13.790861f, 104.0f, 12.0f, 105.79086f, 12.0f, 108.0f),
                    PathNode.LineTo(12.0f, 172.0f),
                    PathNode.CurveTo(12.0f, 174.20914f, 13.790861f, 176.0f, 16.0f, 176.0f),
                    PathNode.CurveTo(18.209139f, 176.0f, 20.0f, 174.20914f, 20.0f, 172.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.LineTo(52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 168.69f),
                    PathNode.CurveTo(51.99242f, 171.87163f, 53.256035f, 174.92447f, 55.51f, 177.17f),
                    PathNode.LineTo(94.83f, 216.49f),
                    PathNode.CurveTo(97.07554f, 218.74396f, 100.12837f, 220.00758f, 103.31f, 220.0f),
                    PathNode.LineTo(180.69f, 220.0f),
                    PathNode.CurveTo(183.87163f, 220.00758f, 186.92447f, 218.74396f, 189.17f, 216.49f),
                    PathNode.LineTo(225.66f, 180.0f),
                    PathNode.LineTo(240.0f, 180.0f),
                    PathNode.CurveTo(246.62741f, 180.0f, 252.0f, 174.62741f, 252.0f, 168.0f),
                    PathNode.LineTo(252.0f, 120.0f),
                    PathNode.CurveTo(252.0f, 113.37258f, 246.62741f, 108.0f, 240.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 168.0f),
                    PathNode.CurveTo(244.0f, 170.20914f, 242.20914f, 172.0f, 240.0f, 172.0f),
                    PathNode.LineTo(224.0f, 172.0f),
                    PathNode.CurveTo(222.93881f, 171.99916f, 221.92079f, 172.42004f, 221.17f, 173.17f),
                    PathNode.LineTo(183.51f, 210.83f),
                    PathNode.CurveTo(182.76166f, 211.57751f, 181.74773f, 211.9982f, 180.69f, 212.0f),
                    PathNode.LineTo(103.31f, 212.0f),
                    PathNode.CurveTo(102.25228f, 211.9982f, 101.238335f, 211.57751f, 100.49f, 210.83f),
                    PathNode.LineTo(61.17f, 171.51f),
                    PathNode.CurveTo(60.422493f, 170.76166f, 60.001812f, 169.74773f, 60.0f, 168.69f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 77.79086f, 61.79086f, 76.0f, 64.0f, 76.0f),
                    PathNode.LineTo(180.69f, 76.0f),
                    PathNode.CurveTo(181.74773f, 76.001816f, 182.76166f, 76.42249f, 183.51f, 77.17f),
                    PathNode.LineTo(221.17f, 114.83f),
                    PathNode.CurveTo(221.92079f, 115.57996f, 222.93881f, 116.00083f, 224.0f, 116.0f),
                    PathNode.LineTo(240.0f, 116.0f),
                    PathNode.CurveTo(242.20914f, 116.0f, 244.0f, 117.79086f, 244.0f, 120.0f),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
