package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorDuotoneIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.46f, 216.0f),
                    PathNode.LineTo(40.54f, 216.0f),
                    PathNode.CurveTo(27.92f, 216.0f, 20.0f, 202.79f, 26.13f, 192.09f),
                    PathNode.LineTo(113.59f, 40.22f),
                    PathNode.CurveTo(119.89f, 29.22f, 136.11f, 29.22f, 142.41f, 40.22f),
                    PathNode.LineTo(229.87f, 192.09f),
                    PathNode.CurveTo(236.0f, 202.79f, 228.08f, 216.0f, 215.46f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 216.0f),
                    PathNode.CurveTo(160.0f, 220.41827f, 156.41827f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(99.58172f, 224.0f, 96.0f, 220.41827f, 96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 211.58173f, 99.58172f, 208.0f, 104.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(156.41827f, 208.0f, 160.0f, 211.58173f, 160.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.8f, 188.09f),
                    PathNode.LineTo(232.14f, 180.0f),
                    PathNode.CurveTo(229.93086f, 176.17267f, 225.03734f, 174.86086f, 221.21f, 177.07f),
                    PathNode.CurveTo(217.38266f, 179.27916f, 216.07086f, 184.17267f, 218.28f, 188.0f),
                    PathNode.LineTo(222.93f, 196.09f),
                    PathNode.CurveTo(224.33644f, 198.47116f, 224.33644f, 201.42883f, 222.93f, 203.81f),
                    PathNode.CurveTo(221.3778f, 206.45778f, 218.51875f, 208.06313f, 215.45f, 208.01f),
                    PathNode.LineTo(192.0f, 208.01f),
                    PathNode.CurveTo(187.58173f, 208.01f, 184.0f, 211.59172f, 184.0f, 216.01f),
                    PathNode.CurveTo(184.0f, 220.42828f, 187.58173f, 224.01f, 192.0f, 224.01f),
                    PathNode.LineTo(215.45f, 224.01f),
                    PathNode.CurveTo(224.23952f, 224.0962f, 232.39267f, 219.43672f, 236.78f, 211.82f),
                    PathNode.CurveTo(241.07104f, 204.4939f, 241.07869f, 195.42332f, 236.8f, 188.09f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 208.0f),
                    PathNode.LineTo(40.55f, 208.0f),
                    PathNode.CurveTo(37.48125f, 208.05313f, 34.6222f, 206.44777f, 33.07f, 203.8f),
                    PathNode.CurveTo(31.663565f, 201.41884f, 31.663565f, 198.46117f, 33.07f, 196.08f),
                    PathNode.LineTo(37.72f, 188.0f),
                    PathNode.CurveTo(39.92914f, 184.17267f, 38.617332f, 179.27916f, 34.79f, 177.07f),
                    PathNode.CurveTo(30.962667f, 174.86086f, 26.06914f, 176.17267f, 23.86f, 180.0f),
                    PathNode.LineTo(19.2f, 188.08f),
                    PathNode.CurveTo(14.919031f, 195.4072f, 14.919031f, 204.47281f, 19.2f, 211.8f),
                    PathNode.CurveTo(23.588276f, 219.42685f, 31.751284f, 224.09143f, 40.55f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(68.41828f, 224.0f, 72.0f, 220.41827f, 72.0f, 216.0f),
                    PathNode.CurveTo(72.0f, 211.58173f, 68.41828f, 208.0f, 64.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.18f, 152.0f),
                    PathNode.CurveTo(205.03845f, 152.00064f, 207.68005f, 150.4761f, 209.10956f, 148.00078f),
                    PathNode.CurveTo(210.53905f, 145.52545f, 210.53923f, 142.47548f, 209.11f, 140.0f),
                    PathNode.LineTo(186.11f, 100.0f),
                    PathNode.CurveTo(183.90086f, 96.17267f, 179.00734f, 94.86086f, 175.18f, 97.07f),
                    PathNode.CurveTo(171.35266f, 99.27914f, 170.04086f, 104.17267f, 172.25f, 108.0f),
                    PathNode.LineTo(195.25f, 148.0f),
                    PathNode.CurveTo(196.67938f, 150.47577f, 199.32123f, 152.00064f, 202.18f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.35f, 36.22f),
                    PathNode.CurveTo(144.90347f, 28.649155f, 136.78006f, 23.999342f, 128.0f, 23.999342f),
                    PathNode.CurveTo(119.21994f, 23.999342f, 111.09653f, 28.649155f, 106.65f, 36.22f),
                    PathNode.LineTo(93.0f, 60.0f),
                    PathNode.CurveTo(90.79086f, 63.82733f, 92.10267f, 68.72086f, 95.93f, 70.93f),
                    PathNode.CurveTo(99.757324f, 73.13914f, 104.65086f, 71.82733f, 106.86f, 68.0f),
                    PathNode.LineTo(120.56f, 44.22f),
                    PathNode.CurveTo(122.14203f, 41.587345f, 124.98857f, 39.97694f, 128.06f, 39.97694f),
                    PathNode.CurveTo(131.13142f, 39.97694f, 133.97797f, 41.587345f, 135.56f, 44.22f),
                    PathNode.LineTo(149.18f, 68.0f),
                    PathNode.CurveTo(150.61118f, 70.47886f, 153.25766f, 72.00422f, 156.12f, 72.0f),
                    PathNode.CurveTo(157.52469f, 72.00483f, 158.90533f, 71.63551f, 160.12f, 70.93f),
                    PathNode.CurveTo(163.92995f, 68.70434f, 165.21849f, 63.81413f, 163.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.85f, 97.07f),
                    PathNode.CurveTo(77.02502f, 94.866745f, 72.1383f, 96.177925f, 69.93f, 100.0f),
                    PathNode.LineTo(46.93f, 140.0f),
                    PathNode.CurveTo(44.72086f, 143.8301f, 46.034904f, 148.72586f, 49.865f, 150.935f),
                    PathNode.CurveTo(53.695095f, 153.14413f, 58.590862f, 151.8301f, 60.8f, 148.0f),
                    PathNode.LineTo(83.8f, 108.0f),
                    PathNode.CurveTo(84.85963f, 106.15972f, 85.14411f, 103.973656f, 84.590775f, 101.92347f),
                    PathNode.CurveTo(84.03743f, 99.87328f, 82.691666f, 98.12723f, 80.85f, 97.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
