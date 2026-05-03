package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorDuotoneIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
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
                    PathNode.MoveTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 107.58172f, 32.0f, 112.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(148.41827f, 32.0f, 152.0f, 35.581722f, 152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 44.418278f, 148.41827f, 48.0f, 144.0f, 48.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(107.58172f, 48.0f, 104.0f, 44.418278f, 104.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(107.58172f, 208.0f, 104.0f, 211.58173f, 104.0f, 216.0f),
                    PathNode.CurveTo(104.0f, 220.41827f, 107.58172f, 224.0f, 112.0f, 224.0f),
                    PathNode.LineTo(144.0f, 224.0f),
                    PathNode.CurveTo(148.41827f, 224.0f, 152.0f, 220.41827f, 152.0f, 216.0f),
                    PathNode.CurveTo(152.0f, 211.58173f, 148.41827f, 208.0f, 144.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.CurveTo(179.58173f, 32.0f, 176.0f, 35.581722f, 176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 44.418278f, 179.58173f, 48.0f, 184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 76.41828f, 211.58173f, 80.0f, 216.0f, 80.0f),
                    PathNode.CurveTo(220.41827f, 80.0f, 224.0f, 76.41828f, 224.0f, 72.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.CurveTo(211.58173f, 104.0f, 208.0f, 107.58172f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 211.58173f, 152.0f, 216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 148.41827f, 224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 107.58172f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 152.0f),
                    PathNode.CurveTo(44.418278f, 152.0f, 48.0f, 148.41827f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 107.58172f, 44.418278f, 104.0f, 40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 107.58172f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 148.41827f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(48.0f, 179.58173f, 44.418278f, 176.0f, 40.0f, 176.0f),
                    PathNode.CurveTo(35.581722f, 176.0f, 32.0f, 179.58173f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(76.41828f, 224.0f, 80.0f, 220.41827f, 80.0f, 216.0f),
                    PathNode.CurveTo(80.0f, 211.58173f, 76.41828f, 208.0f, 72.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
