package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorDuotoneIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.LineTo(183.39f, 216.0f),
                    PathNode.CurveTo(227.20497f, 188.39522f, 244.01883f, 132.75027f, 222.82188f, 85.5013f),
                    PathNode.CurveTo(201.62495f, 38.25232f, 148.88293f, 13.811673f, 99.13115f, 28.183016f),
                    PathNode.CurveTo(49.379356f, 42.554356f, 17.79359f, 91.354f, 25.056107f, 142.62808f),
                    PathNode.CurveTo(32.318623f, 193.90218f, 76.214134f, 232.01056f, 128.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.41827f, 232.0f, 240.0f, 228.41827f, 240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 219.58173f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(143.42473f, 39.98316f, 158.57986f, 44.04362f, 171.93f, 51.77f),
                    PathNode.CurveTo(162.28902f, 56.12936f, 152.97195f, 61.172207f, 144.05f, 66.86f),
                    PathNode.CurveTo(129.92703f, 57.85422f, 114.83116f, 50.47402f, 99.05f, 44.86f),
                    PathNode.CurveTo(108.35756f, 41.62166f, 118.1452f, 39.978546f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.56f, 55.24f),
                    PathNode.CurveTo(96.49129f, 60.09266f, 113.683815f, 67.348434f, 129.67f, 76.81f),
                    PathNode.CurveTo(122.83853f, 81.95163f, 116.30467f, 87.477196f, 110.1f, 93.36f),
                    PathNode.CurveTo(93.682205f, 84.62347f, 76.01944f, 78.46156f, 57.73f, 75.09f),
                    PathNode.CurveTo(63.54631f, 67.38339f, 70.58227f, 60.678467f, 78.56f, 55.24f),
                    PathNode.Close,
                    PathNode.MoveTo(48.72f, 89.82f),
                    PathNode.CurveTo(65.98974f, 92.3438f, 82.75275f, 97.57824f, 98.39f, 105.33f),
                    PathNode.CurveTo(92.836975f, 111.43249f, 87.6193f, 117.8319f, 82.76f, 124.5f),
                    PathNode.CurveTo(69.59462f, 118.59063f, 55.608757f, 114.71316f, 41.28f, 113.0f),
                    PathNode.CurveTo(42.667755f, 104.96439f, 45.171986f, 97.16223f, 48.72f, 89.82f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 129.0f),
                    PathNode.CurveTo(51.572266f, 130.43033f, 62.890152f, 133.4592f, 73.63f, 138.0f),
                    PathNode.CurveTo(66.04839f, 150.17178f, 59.661983f, 163.0484f, 54.56f, 176.45f),
                    PathNode.CurveTo(45.228954f, 162.37f, 40.1722f, 145.89038f, 40.0f, 129.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.42f, 190.81f),
                    PathNode.CurveTo(85.86014f, 132.48665f, 129.95251f, 85.65542f, 187.0f, 62.74f),
                    PathNode.CurveTo(193.31514f, 68.4537f, 198.77751f, 75.04423f, 203.22f, 82.31f),
                    PathNode.CurveTo(146.67473f, 102.09189f, 103.309525f, 148.17723f, 87.0f, 205.82f),
                    PathNode.CurveTo(79.45606f, 201.83371f, 72.52779f, 196.77812f, 66.43f, 190.81f),
                    PathNode.Close,
                    PathNode.MoveTo(125.66f, 216.0f),
                    PathNode.CurveTo(117.57011f, 215.77309f, 109.5506f, 214.42697f, 101.83f, 212.0f),
                    PathNode.CurveTo(116.47526f, 157.89743f, 157.16068f, 114.67598f, 210.28f, 96.79f),
                    PathNode.CurveTo(213.15538f, 104.35294f, 214.96602f, 112.27872f, 215.66f, 120.34f),
                    PathNode.CurveTo(172.0727f, 135.97517f, 138.61102f, 171.54121f, 125.66f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.48f, 137.56f),
                    PathNode.CurveTo(211.16388f, 176.61464f, 181.53094f, 208.10295f, 142.81f, 214.78f),
                    PathNode.CurveTo(154.79738f, 179.77788f, 181.27489f, 151.63164f, 215.48f, 137.53f),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
