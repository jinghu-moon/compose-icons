package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorThinIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.46 54.54c-14.074-14.031-36.846-14.031-50.92 0L138.89 66.76c-1.545 1.483-3.984 1.486-5.532 .007-1.549-1.479-1.658-3.915-.248-5.527L144.82 49C155.872 37.629 172.188 33.084 187.527 37.104c15.339 4.02 27.329 15.983 31.383 31.313 4.054 15.33-.454 31.656-11.8 42.734l-12.35 11.78c-1.612 1.41-4.048 1.301-5.527-.248-1.479-1.549-1.476-3.987 .007-5.532l12.28-11.72c14.028-14.073 14.001-36.85-.06-50.89ZM117.11 189.24l-11.65 12.22c-14.042 14.083-36.842 14.117-50.925 .075C40.452 187.493 40.418 164.693 54.46 150.61L66.74 138.89c1.483-1.545 1.486-3.984 .007-5.532-1.479-1.549-3.915-1.658-5.527-.248L48.89 144.89C37.26 155.906 32.536 172.373 36.557 187.879c4.021 15.506 16.152 27.602 31.67 31.578 15.518 3.976 31.97-.795 42.953-12.457l11.71-12.28c1.061-1.018 1.478-2.537 1.085-3.954-.393-1.417-1.531-2.505-2.965-2.832-1.434-.327-2.931 .159-3.9 1.266ZM216 156h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM40 100h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM160 188c-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4ZM96 68c2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
