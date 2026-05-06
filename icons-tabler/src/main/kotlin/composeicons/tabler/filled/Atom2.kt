package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Atom2: ImageVector
    get() {
        if (_atom2 != null) return _atom2!!
        _atom2 = tablerFilledIcon(
            name = "Atom2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C9.951 16.071 8.114 14.38 8.005 12.2L8 12l.005-.2C8.112 9.671 9.869 8 12 8Z")
            addPathData("M12 20c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 21c0-.552 .448-1 1-1Z")
            addPathData("M3 8c.507 0 .934 .38 .993 .883L4 9.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2 9C2 8.448 2.448 8 3 8Z")
            addPathData("M21 8c.507 0 .934 .38 .993 .883L22 9.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 9c0-.552 .448-1 1-1Z")
            addPathData("M2.89 12.006c.264-.029 .528 .048 .735 .213 .207 .166 .34 .407 .369 .671 .301 2.726 1.979 5.108 4.444 6.311 .497 .242 .703 .841 .462 1.337-.242 .497-.841 .703-1.338 .462C4.48 19.497 2.383 16.519 2.006 13.11c-.06-.549 .335-1.042 .884-1.103Z")
            addPathData("M20.993 12l.117 .006c.264 .029 .505 .162 .671 .369 .166 .207 .243 .471 .213 .735-.377 3.408-2.474 6.386-5.556 7.889-.497 .242-1.095 .036-1.337-.461-.242-.497-.036-1.095 .461-1.337 2.465-1.202 4.142-3.584 4.444-6.31 .055-.504 .48-.887 .987-.891Z")
            addPathData("M5.567 4.226c3.684-3.015 8.982-3.015 12.666 0 .283 .224 .423 .583 .367 .94-.056 .356-.3 .655-.639 .781-.338 .126-.718 .06-.994-.173C14.02 3.362 9.78 3.362 6.833 5.774c-.276 .233-.656 .299-.994 .173C5.501 5.821 5.257 5.522 5.2 5.166c-.056-.356 .084-.716 .367-.94Z")
        }
        return _atom2!!
    }

private var _atom2: ImageVector? = null
