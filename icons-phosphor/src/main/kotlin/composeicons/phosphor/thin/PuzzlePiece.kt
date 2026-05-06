package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorThinIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.14 161.93c-1.16-.738-2.618-.829-3.86-.24-7.687 3.644-16.729 2.947-23.766-1.833-7.037-4.78-11.018-12.928-10.464-21.417 .516-7.935 4.929-15.1 11.783-19.131 6.855-4.031 15.261-4.405 22.447-.999 1.239 .59 2.694 .504 3.855-.229 1.161-.732 1.865-2.009 1.865-3.381v-42.7c0-6.627-5.373-12-12-12h-41c3.004-11.727-.868-24.145-10.003-32.088C147.861 19.969 135.025 17.861 123.829 22.465c-11.196 4.604-18.835 15.133-19.739 27.205-.25 3.47 .057 6.957 .91 10.33h-41C57.373 60 52 65.373 52 72v37c-11.727-3.004-24.145 .868-32.088 10.003-7.943 9.136-10.051 21.971-5.446 33.167 4.604 11.196 15.133 18.835 27.205 19.739 3.47 .255 6.958-.052 10.33-.91v37c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-42.69c0-1.371-.702-2.647-1.86-3.38ZM212 208c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-42.69c0-1.371-.702-2.647-1.86-3.38-1.157-.734-2.61-.825-3.85-.24-7.187 3.411-15.596 3.039-22.454-.993C24.979 156.666 20.564 149.498 20.05 141.56c-.556-8.492 3.426-16.643 10.466-21.424 7.04-4.781 16.086-5.475 23.774-1.826 1.238 .586 2.69 .497 3.848-.235 1.158-.732 1.86-2.005 1.862-3.375v-42.7c0-2.209 1.791-4 4-4h46.69c1.371 .001 2.648-.7 3.382-1.858 .734-1.158 .824-2.612 .238-3.852-3.411-7.187-3.039-15.596 .993-22.454 4.032-6.858 11.199-11.272 19.137-11.786 8.492-.556 16.643 3.426 21.424 10.466 4.781 7.04 5.475 16.086 1.826 23.774-.586 1.24-.497 2.693 .238 3.852 .734 1.158 2.011 1.86 3.382 1.858h46.69c2.209 0 4 1.791 4 4v37c-3.371-.863-6.859-1.181-10.33-.94-12.025 .966-22.486 8.612-27.055 19.777-4.569 11.165-2.471 23.951 5.428 33.07 7.898 9.119 20.254 13.021 31.957 10.092Z"),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
