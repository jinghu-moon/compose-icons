package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorDuotoneIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 149.25484f, 69.25484f, 160.0f, 56.0f, 160.0f),
                    PathNode.CurveTo(42.745167f, 160.0f, 32.0f, 149.25484f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 122.74516f, 42.745167f, 112.0f, 56.0f, 112.0f),
                    PathNode.CurveTo(69.25484f, 112.0f, 80.0f, 122.74516f, 80.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(114.74516f, 64.0f, 104.0f, 74.74516f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 101.25484f, 114.74516f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(141.25484f, 112.0f, 152.0f, 101.25484f, 152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 74.74516f, 141.25484f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(186.74516f, 144.0f, 176.0f, 154.74516f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 181.25484f, 186.74516f, 192.0f, 200.0f, 192.0f),
                    PathNode.CurveTo(213.25484f, 192.0f, 224.0f, 181.25484f, 224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 154.74516f, 213.25484f, 144.0f, 200.0f, 144.0f),
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
                    PathNode.MoveTo(64.0f, 105.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 60.418278f, 32.0f, 56.0f, 32.0f),
                    PathNode.CurveTo(51.581722f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 105.0f),
                    PathNode.CurveTo(33.840683f, 108.62536f, 23.937254f, 121.38393f, 23.937254f, 136.0f),
                    PathNode.CurveTo(23.937254f, 150.61607f, 33.840683f, 163.37465f, 48.0f, 167.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 51.581722f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(60.418278f, 224.0f, 64.0f, 220.41827f, 64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 167.0f),
                    PathNode.CurveTo(78.15932f, 163.37465f, 88.062744f, 150.61607f, 88.062744f, 136.0f),
                    PathNode.CurveTo(88.062744f, 121.38393f, 78.15932f, 108.62536f, 64.0f, 105.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 152.0f),
                    PathNode.CurveTo(47.163445f, 152.0f, 40.0f, 144.83656f, 40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 127.163445f, 47.163445f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(64.836555f, 120.0f, 72.0f, 127.163445f, 72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 144.83656f, 64.836555f, 152.0f, 56.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 57.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 57.0f),
                    PathNode.CurveTo(105.84068f, 60.62536f, 95.937256f, 73.38393f, 95.937256f, 88.0f),
                    PathNode.CurveTo(95.937256f, 102.61607f, 105.84068f, 115.37464f, 120.0f, 119.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 119.0f),
                    PathNode.CurveTo(150.15932f, 115.37464f, 160.06276f, 102.61607f, 160.06276f, 88.0f),
                    PathNode.CurveTo(160.06276f, 73.38393f, 150.15932f, 60.62536f, 136.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(119.163445f, 104.0f, 112.0f, 96.836555f, 112.0f, 88.0f),
                    PathNode.CurveTo(112.0f, 79.163445f, 119.163445f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(136.83656f, 72.0f, 144.0f, 79.163445f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 96.836555f, 136.83656f, 104.0f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 168.0f),
                    PathNode.CurveTo(231.9862f, 153.40929f, 222.1221f, 140.66814f, 208.0f, 137.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.CurveTo(195.58173f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 137.0f),
                    PathNode.CurveTo(177.84068f, 140.62535f, 167.93724f, 153.38393f, 167.93724f, 168.0f),
                    PathNode.CurveTo(167.93724f, 182.61607f, 177.84068f, 195.37465f, 192.0f, 199.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(192.0f, 220.41827f, 195.58173f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 199.0f),
                    PathNode.CurveTo(222.1221f, 195.33186f, 231.9862f, 182.59071f, 232.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.CurveTo(191.16344f, 184.0f, 184.0f, 176.83656f, 184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 159.16344f, 191.16344f, 152.0f, 200.0f, 152.0f),
                    PathNode.CurveTo(208.83656f, 152.0f, 216.0f, 159.16344f, 216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 176.83656f, 208.83656f, 184.0f, 200.0f, 184.0f),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
