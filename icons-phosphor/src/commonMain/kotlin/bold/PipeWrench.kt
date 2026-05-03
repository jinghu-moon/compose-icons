package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorBoldIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.11f, 40.2f),
                    PathNode.LineTo(218.75f, 39.85f),
                    PathNode.LineTo(185.92f, 9.64f),
                    PathNode.CurveTo(178.0915f, 2.069668f, 165.64503f, 2.154126f, 157.92f, 9.83f),
                    PathNode.LineTo(110.36f, 57.11f),
                    PathNode.CurveTo(97.81866f, 45.243763f, 78.12518f, 45.465992f, 65.854805f, 57.612213f),
                    PathNode.CurveTo(53.584423f, 69.75843f, 53.161922f, 89.44862f, 64.9f, 102.11f),
                    PathNode.LineTo(49.84f, 117.11f),
                    PathNode.CurveTo(46.08752f, 120.86096f, 43.97927f, 125.949265f, 43.97927f, 131.255f),
                    PathNode.CurveTo(43.97927f, 136.56073f, 46.08752f, 141.64903f, 49.84f, 145.4f),
                    PathNode.LineTo(67.56f, 163.12f),
                    PathNode.LineTo(37.36f, 193.32f),
                    PathNode.CurveTo(24.861797f, 205.8182f, 24.861797f, 226.0818f, 37.36f, 238.58f),
                    PathNode.CurveTo(49.858204f, 251.0782f, 70.121796f, 251.0782f, 82.62f, 238.58f),
                    PathNode.LineTo(82.62f, 238.58f),
                    PathNode.LineTo(174.13f, 146.26f),
                    PathNode.CurveTo(177.93184f, 142.4459f, 180.03491f, 137.25981f, 179.96338f, 131.875f),
                    PathNode.CurveTo(179.89186f, 126.49019f, 177.65181f, 121.36176f, 173.75f, 117.65f),
                    PathNode.LineTo(160.75f, 105.25f),
                    PathNode.LineTo(172.66f, 93.45f),
                    PathNode.LineTo(187.39f, 106.45f),
                    PathNode.CurveTo(195.25641f, 113.98195f, 207.70328f, 113.83525f, 215.39f, 106.12f),
                    PathNode.LineTo(219.1f, 102.41f),
                    PathNode.CurveTo(227.35301f, 94.15821f, 231.98961f, 82.96565f, 231.98961f, 71.295f),
                    PathNode.CurveTo(231.98961f, 59.624348f, 227.35301f, 48.43179f, 219.1f, 40.18f),
                    PathNode.Close,
                    PathNode.MoveTo(69.65f, 131.32f),
                    PathNode.LineTo(81.86f, 119.13f),
                    PathNode.LineTo(96.73f, 134.0f),
                    PathNode.LineTo(84.53f, 146.21f),
                    PathNode.Close,
                    PathNode.MoveTo(65.65f, 221.68f),
                    PathNode.CurveTo(62.521305f, 224.80042f, 57.455414f, 224.79369f, 54.335f, 221.665f),
                    PathNode.CurveTo(51.214592f, 218.5363f, 51.221306f, 213.47041f, 54.35f, 210.35f),
                    PathNode.LineTo(122.21f, 142.49f),
                    PathNode.CurveTo(124.469444f, 140.23837f, 125.73946f, 137.17982f, 125.73946f, 133.99f),
                    PathNode.CurveTo(125.73946f, 130.80019f, 124.469444f, 127.74162f, 122.21f, 125.49f),
                    PathNode.LineTo(82.33f, 85.66f),
                    PathNode.CurveTo(79.20407f, 82.534065f, 79.20407f, 77.465935f, 82.33f, 74.34f),
                    PathNode.CurveTo(85.45593f, 71.214066f, 90.52407f, 71.214066f, 93.65f, 74.34f),
                    PathNode.CurveTo(93.71f, 74.41f, 93.78f, 74.47f, 93.84f, 74.53f),
                    PathNode.LineTo(154.28f, 132.25f),
                    PathNode.Close,
                    PathNode.MoveTo(202.14f, 85.46f),
                    PathNode.LineTo(201.14f, 86.46f),
                    PathNode.LineTo(186.27f, 73.44f),
                    PathNode.CurveTo(178.40121f, 66.070335f, 166.11456f, 66.23816f, 158.45f, 73.82f),
                    PathNode.LineTo(143.45f, 88.7f),
                    PathNode.LineTo(127.73f, 73.7f),
                    PathNode.LineTo(172.1f, 29.53f),
                    PathNode.LineTo(202.29f, 57.33f),
                    PathNode.CurveTo(209.9568f, 65.16355f, 209.88991f, 77.70866f, 202.14f, 85.46f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
