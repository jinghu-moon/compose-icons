package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorThinIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.46 57.85l-.09-.08L172.44 15.46c-4.679-4.646-12.231-4.646-16.91 0L108.15 62.46l-4.35-4.39C95.56 50.087 82.439 50.194 74.331 58.31c-8.108 8.116-8.202 21.238-.211 29.47l4.25 4.31L55.51 114.83c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l12.69 12.65c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l22.77-22.45 14.91 15.12c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83h0L58.14 208.2c-5.756 5.201-8.175 13.152-6.292 20.678 1.883 7.526 7.762 13.401 15.289 15.278 7.527 1.878 15.476-.547 20.674-6.306l88.68-89.37c4.673-4.684 4.673-12.266 0-16.95L138 92.62 153.77 77.17c.751-.757 1.773-1.183 2.84-1.183 1.067 0 2.089 .426 2.84 1.183l37.4 35.35c4.682 4.659 12.248 4.659 16.93 0l3.72-3.71c6.754-6.752 10.548-15.91 10.548-25.46 0-9.55-3.794-18.708-10.548-25.46ZM79.51 138.85c-1.561 1.558-4.089 1.558-5.65 0L61.17 126.14c-1.558-1.561-1.558-4.089 0-5.65L84 97.78l18.32 18.58ZM170.82 142.85 82.14 232.2c-3.199 3.644-8.16 5.205-12.869 4.049-4.709-1.156-8.383-4.836-9.531-9.547-1.148-4.711 .421-9.669 4.07-12.862l64.69-65.37c4.666-4.683 4.666-12.257 0-16.94L79.8 82.14C75.282 76.994 75.532 69.225 80.37 64.379c4.838-4.846 12.606-5.108 17.76-.599l72.7 73.39c.753 .752 1.175 1.773 1.173 2.837-.002 1.064-.428 2.084-1.183 2.833ZM211.82 103.12l-3.72 3.72c-1.561 1.558-4.089 1.558-5.65 0l-.09-.08L165 71.42c-4.689-4.59-12.194-4.563-16.85 .06L132.33 86.94 113.78 68.21l47.39-47c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l.09 .08 44.92 42.3c10.909 10.93 10.909 28.63 0 39.56Z"),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
