package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorDuotoneIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
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
                    PathNode.MoveTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 52.418278f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(27.581722f, 56.0f, 24.0f, 52.418278f, 24.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 72.0f),
                    PathNode.CurveTo(139.58173f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 139.58173f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(148.41827f, 184.0f, 152.0f, 180.41827f, 152.0f, 176.0f),
                    PathNode.LineTo(152.0f, 147.0f),
                    PathNode.LineTo(165.09f, 132.0f),
                    PathNode.LineTo(193.09f, 180.0f),
                    PathNode.CurveTo(194.41734f, 182.66592f, 197.11566f, 184.37389f, 200.09317f, 184.4328f),
                    PathNode.CurveTo(203.07066f, 184.49173f, 205.83444f, 182.89185f, 207.26622f, 180.28053f),
                    PathNode.CurveTo(208.698f, 177.6692f, 208.56075f, 174.47871f, 206.91f, 172.0f),
                    PathNode.LineTo(176.21f, 119.37f),
                    PathNode.LineTo(206.0f, 85.27f),
                    PathNode.CurveTo(208.09082f, 83.15783f, 208.83842f, 80.06068f, 207.94138f, 77.22729f),
                    PathNode.CurveTo(207.04433f, 74.3939f, 204.6505f, 72.29132f, 201.72505f, 71.76729f),
                    PathNode.CurveTo(198.79962f, 71.24326f, 195.8248f, 72.38417f, 194.0f, 74.73f),
                    PathNode.LineTo(152.0f, 122.73f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 75.58172f, 148.41827f, 72.0f, 144.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(36.94596f, 159.99771f, 34.159683f, 158.25682f, 32.818584f, 155.51299f),
                    PathNode.CurveTo(31.477488f, 152.76915f, 31.815582f, 149.50114f, 33.69f, 147.09f),
                    PathNode.LineTo(89.69f, 75.09f),
                    PathNode.CurveTo(91.78911f, 72.39659f, 95.36642f, 71.3325f, 98.59636f, 72.44074f),
                    PathNode.CurveTo(101.826294f, 73.54899f, 103.99671f, 76.58522f, 104.0f, 80.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.CurveTo(116.41828f, 144.0f, 120.0f, 147.58173f, 120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 156.41827f, 116.41828f, 160.0f, 112.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.CurveTo(104.0f, 180.41827f, 100.41828f, 184.0f, 96.0f, 184.0f),
                    PathNode.CurveTo(91.58172f, 184.0f, 88.0f, 180.41827f, 88.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 103.32f),
                    PathNode.LineTo(56.36f, 144.0f),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
